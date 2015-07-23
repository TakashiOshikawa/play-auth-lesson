package util

//import play.api.libs.json._

import models.table.Task
import play.api.libs.json._

/**
 * Created by oshikawatakashi on 2015/07/21.
 */
object Utility {
//trait Utility[A] {

  def convertIntSeqToJson(sq: Seq[Int]): JsValue = Json.toJson(sq)


  // convert task to Json
  def convertTaskToJson(task: Seq[Task]): JsValue = {
    implicit val writes = Json.writes[Task]
    implicit val reads = Json.reads[Task]
    Json.toJson(task)
  }

  case class DisplayName(name:String)
  implicit val displayNameWrite: Writes[DisplayName] = Writes {
    (displayName: DisplayName) => JsString(displayName.name)
  }


  //JSON parse test method
  case class Person(id:Int, name:String)

  def parseJson(): JsValue = {
    implicit val writes = Json.writes[Person]
    implicit val reads = Json.reads[Person]

    val person = Person(1, "shiba")
    val jsValue1: JsValue = Json.toJson(person)
    jsValue1
  }


}
