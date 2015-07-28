package util

//import play.api.libs.json._

import models.User
import models.table._
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


  //conver User to Json
  def convertUserToJson(user: Seq[User]): JsValue = {
    implicit val write = Json.writes[User]
    implicit val reads = Json.reads[User]
    Json.toJson(user)
  }


  // Convert case class to Json
//  def convertCaseToJson[A](obj: Seq[A]): JsValue = {
//    implicit val write = Json.writes[A]
//    implicit val reads = Json.reads[A]
//    Json.toJson(obj)
//  }


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


  def multi3(num: Int): Int = {
    (1 to num).par.map( _*3 ).sum
  }


  // Measure the execution time
  def measureExecutionTime[A](f: A): (A, Double) = {
    val start = System.currentTimeMillis()
    val res1 = f
    val end = System.currentTimeMillis()
    val time = end - start
    (res1, time)
  }


}
