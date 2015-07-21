package util

//import play.api.libs.json._
import play.api.libs.json._

/**
 * Created by oshikawatakashi on 2015/07/21.
 */
object Utility {

  def convertSeqToJson(sq: Seq[Int]): JsValue = {

//    val ls = List(1,2,3,4,5,5,6)
//    val json: JsValue = Json.parse("""
//                          {
//                            "name" : "Watership Down",
//                            "location" : {
//                              "lat" : 51.235685,
//                              "long" : -1.309197
//                            },
//                            "residents" : [ {
//                              "name" : "Fiver",
//                              "age" : 4,
//                              "role" : null
//                            }, {
//                              "name" : "Bigwig",
//                              "age" : 6,
//                              "role" : "Owsla"
//                            } ]
//                          }
//                        """)

//    val json3: JsValue = Json.toJson(sq)
//    json3
    Json.toJson(sq)

  }

}
