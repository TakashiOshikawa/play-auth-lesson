package util

//import play.api.libs.json._

import models.table.Task
import play.api.libs.json._
import play.api.libs.functional.syntax._

/**
 * Created by oshikawatakashi on 2015/07/21.
 */
object Utility {
//trait Utility[A] {

  def convertIntSeqToJson(sq: Seq[Int]): JsValue = {

    Json.toJson(sq)

  }


//  def convertTaskToJson(task: Seq[JsValue]): JsValue = {
//    Json.toJson(task)
//  }


//  implicit val convertTaskToJson = new Writes[Task] {
//    def writes(t: Task): JsValue = {
//      Json.obj(
//        "id" -> t.id,
//        "taskTitle" -> t.taskTitle,
//        "taskContent" -> t.taskContent
//      )
//    }
//  }

//  implicit val convertTaskToJson: Reads[Task] = (
  implicit val convertTaskToJson: Reads[Task] = (
    (__ \ "id").read[Int] and
    (__ \ "taskTitle").read[String] and
    (__ \ "taskContent").read[String]
  )(Task)

  case class DisplayName(name:String)
  implicit val displayNameWrite: Writes[DisplayName] = Writes {
    (displayName: DisplayName) => JsString(displayName.name)
  }

  case class Person(id:Int, name:String)

  def parseJson(): JsValue = {
    implicit val writes = Json.writes[Person]
    implicit val reads = Json.reads[Person]

    val person = Person(1, "shiba")

    //ScalaObject => jsonString
    val jsValue1: JsValue = Json.toJson(person)
    jsValue1
  }


}
