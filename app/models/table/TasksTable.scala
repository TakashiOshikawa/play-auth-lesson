package models.table

import slick.driver.H2Driver.api._
import slick.lifted.Tag



/**
 * Created by oshikawatakashi on 2015/07/18.
 */
class TasksTable(tag: Tag) extends Table[(Int, String, String)](tag, "Tasks") {
  def id = column[Int]("ID", O.PrimaryKey)
  def taskTitle = column[String]("TASK_TITLE")
  def taskContent = column[String]("TASK_CONTENT")

//  def _id = (id)
//  def _taskTitle = (taskTitle)
//  def _taskContent = (taskContent)
  def * = (id, taskTitle, taskContent)
}