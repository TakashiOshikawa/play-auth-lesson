package models.table

import slick.driver.H2Driver.api._
import slick.lifted.Tag



/**
 * Created by oshikawatakashi on 2015/07/18.
 */

case class Task(id: Int, taskTitle: String, taskContent: String)
case class Task2(id: Int, taskTitle: String, taskContent: String)
case class Task3(id: Int, taskTitle: String, taskContent: String)

class TasksTable(tag: Tag) extends Table[(Int, String, String)](tag, "tasks") {
  def id = column[Int]("id", O.PrimaryKey)
  def taskTitle = column[String]("task_title")
  def taskContent = column[String]("task_content")

//  def _id = (id)
//  def _taskTitle = (taskTitle)
//  def _taskContent = (taskContent)
  def * = (id, taskTitle, taskContent)
}