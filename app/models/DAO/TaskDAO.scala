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

  def setupDB() = {
    val db = Database.forConfig("h2mem1")
    Await.result(db.run(DBIO.seq(
      // create the schema
      tasks.schema.create
    )), Duration.Inf)
  }

  def setup() = {
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
//  def resultWrapper( dbio: slick.driver.H2Driver.StreamingDriverAction[Seq[_],_,slick.dbio.Effect.Read] ) = {
  lazy val resultWrapper = ( dbio: slick.driver.H2Driver.StreamingDriverAction[Seq[_],_,slick.dbio.Effect.Read] ) => {
    val db = Database.forConfig("h2mem1")
    try{
      Await.result(db.run(dbio), Duration.Inf)
    } finally db.close
  }


  //SELECT * FROM tasks
//  def findAll() = {
  lazy val findAll = {
    val db = Database.forConfig("h2mem1")
    try {
      // Execute query
      val query = tasks.filter(_.id <= 2).map(t => t.*)

      val res = Await.result(db.run(query.result), Duration.Inf)
      res.toSeq
    } finally db.close
  }


  //SELECT task_name, task_title FROM tasks
//  def findTaskTitle() = {
  lazy val findTaskTitle = {
    val query = tasks.map( _.taskTitle ).result
    resultWrapper(query)
  }


  // SELECT select column FROM tasks
//  def findTasksById(id: Int) = {
  lazy val findTasksById = (id: Int) => {
    val query = tasks.filter( _.id <= id ).map( _.* ).result
    resultWrapper(query)
  }


}