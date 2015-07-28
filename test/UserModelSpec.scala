import util._
import models.DAO.TaskDAO
import models.User
import models.table._
import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._

/**
 * Created by oshikawatakashi on 2015/07/15.
 */
@RunWith(classOf[JUnitRunner])
//class UserModelSpec extends Specification with Mockito {
class UserModelSpec extends Specification {

"User model test" should {

    "test1" in {
      add(5,6) === 11
    }

    "5 plus 4 equals 9" in {
      add(5, 4) === 9
    }

  }

  val add = (x: Int, y: Int) => x + y



//  "DB connection test" should {
//
//    "find user by user_id" in new WithApplication {
//      running(FakeApplication(additionalConfiguration = inMemoryDatabase("prov_user"))) {
//
//        //        val user = User.create(User("okamoto", "okamotos", "オカモト・タカシ"))
//        val Some(user2) = User.findByUserId("okamoto")
//
//        //        user.nick_name must equalTo("nameTest")
//        //        println(user2)
//        //        user.nick_name must equalTo("オカモト・タカシ")
//        user2.nick_name must equalTo("オカモト・タカシ")
//      }
//    }
//
//    "find user by nick_name" in new WithApplication {
//      running(FakeApplication(additionalConfiguration = inMemoryDatabase("prov_user"))) {
//        val Some(user3) = User.findByNickname("オカモト・タカシ")
//        user3.user_id must equalTo("okamoto")
//      }
//    }
//
//    "findAll user" in new WithApplication {
//      running(FakeApplication( additionalConfiguration = inMemoryDatabase("prov_user")) ) {
//        val users = User.findAll
//        users.size must equalTo(1)
//      }
//    }
//
//  }




  "Slick DB Connection Test" should {

    "setup DB" in {
      println( TaskDAO.setup )
//      println( TaskDAO.setupDB )
      1 must equalTo(1)
    }

    "select task_title from tasks" in {
      val res = TaskDAO.findTaskTitle
      println( res )
      res.length must equalTo(3)
    }

    "select tasks by id" in {
      val res = TaskDAO.findTasksById(2)
      println( res )
      res.length must equalTo(1)
    }

    "insert Task data" in {
      val t = TaskDAO.insertTask((6, "test6", "test6"))
      println(t)
      1 must equalTo(1)
    }

    "select all Task title" in {
      val res = TaskDAO.findAll
      println(res)
      res.length must equalTo(4)
    }

  }


  "Json Value test" should {
    "It receives defined data as jSON" in {
      val json = Utility.convertIntSeqToJson(Seq(1,2,3))
      println( json )
      1 must equalTo(1)
    }

    "convert to task to json" in {
      val t = Task(5, "fg", "jk")
      val tj = Utility.convertTaskToJson(Seq(t))
//      val t2 = Task2(6, "as", "fd")
//      val tj2 = Utility.convertTaskToJson(Seq(t2))
      println(tj)
      1 must equalTo(1)
    }

    "Anonymous Functions" in {
      ((x: Int) => x * x)(3) must equalTo(9)
    }

    "parseJson" in {
      val json = Utility.parseJson()
      1 must equalTo(1)
    }

    "convert User to Json" in {
      val user = User("4", "user_pass", "user1")
      val jsonUser = Utility.convertUserToJson(Seq(user))
      1 must equalTo(1)
    }

  }


  "Utilities" should {
    "measure the execution time" in {
      val time = Utility measureExecutionTime( Utility multi3(5273) )
      println( time )
      1 must equalTo(1)
    }
  }



}
