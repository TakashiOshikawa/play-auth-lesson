package models

import slick.driver.H2Driver.api._

import scala.concurrent.Future

import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Created by oshikawatakashi on 2015/07/16.
 */

//case class Task(task_title: String, task_content: String)

object Task {

  val db = Database.forConfig("h2mem1")
  try {


  class Tasks(tag: Tag) extends Table[(Int, String, String)](tag, "Tasks") {
    def id = column[Int]("ID", O.PrimaryKey)
    def taskTitle = column[String]("TASK_TITLE")
    def taskContent = column[String]("TASK_CONTENT")

    def * = (id, taskTitle, taskContent)
  }
  val tasks = TableQuery[Tasks]


  val setup = DBIO.seq(
    (tasks.schema).create,

    tasks ++= Seq(
      (1, "get up",           "Get up morning"),
      (2, "have a breakfast", "Have a breakfast"),
      (3, "buy shirts",       "You have to buy a Lacoste's t-shirts")
    )
  )

  val setupFuture = db.run(setup)


  val task = for( t <- tasks )
                yield LiteralColumn("  ") ++ t.id.asColumnOf[String] ++ "\t" ++ t.taskContent.asColumnOf[String] ++
                      "\t" ++ t.taskTitle.asColumnOf[String]

  val q = for (c <- tasks) yield c.taskContent
  val a = q.result
  val f: Future[Seq[String]] = db.run(a)
  f.onSuccess { case s => println(s"Result: $s") }


  db.stream(task.result).foreach{println}

    // ...
  } finally db.close

}
