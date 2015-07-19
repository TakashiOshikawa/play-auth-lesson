package models.DAO

import models.table.TasksTable
import slick.driver.H2Driver.api._

import scala.concurrent.duration.Duration

//import slick.driver.MySQLDriver.api._

import slick.dbio.DBIO
import slick.lifted.TableQuery

import scala.concurrent.Await
//import scala.concurrent.ExecutionContext.Implicits.global


//import scala.concurrent.Await
//import scala.concurrent.duration.Duration


/**
 * Created by oshikawatakashi on 2015/05/10.
 *
 * mapで作るqueryの型 : slick.dbio.DBIOAction[_,slick.dbio.NoStream,Nothing]
 */


object TaskDAO {

  val tasks: TableQuery[TasksTable] = TableQuery[TasksTable]

  lazy val setupDB = {
    val db = Database.forConfig("h2mem1")
    Await.result(db.run(DBIO.seq(
      // create the schema
      tasks.schema.create
    )), Duration.Inf)
  }

  lazy val setup = {
    val db = Database.forConfig("h2mem1")
    Await.result(db.run(DBIO.seq(
      // create the schema
      tasks.schema.create,

      // insert two User instances
      tasks ++= Seq(
        (1, "taks1", "taks1 content"),
        (2, "taks2", "taks2 content"),
        (3, "taks3", "taks3 content")
      ),

      // print the users (select * from USERS)
      tasks.result
    )), Duration.Inf)
  }




  //DBIO
  val resultWrapper = (dbio: slick.dbio.DBIOAction[_,slick.dbio.NoStream,Nothing]) => {
    val db = Database.forConfig("h2mem1")
    Await.result(db.run(dbio), Duration.Inf)
  }


  //SELECT task_title FROM tasks
  def findAll() = {
    val db = Database.forConfig("h2mem1")
    try {
      // Execute query
      //    val query = for (r <- tasks) yield r.taskTitle
      val query = tasks.map(t => t.taskTitle)
      //    val results = db.run(query.result.map(println))

      val find = Await.result(db.run(query.result), Duration.Inf)
      find.toList
    } finally db.close

  }



}