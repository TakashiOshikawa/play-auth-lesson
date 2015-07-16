import models._
import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test.Helpers._
import play.api.test._

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



  "DB connection test" should {

    "find user by user_id" in new WithApplication {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase("prov_user"))) {

        //        val user = User.create(User("okamoto", "okamotos", "オカモト・タカシ"))
        val Some(user2) = User.findByUserId("okamoto")

        //        user.nick_name must equalTo("nameTest")
        //        println(user2)
        //        user.nick_name must equalTo("オカモト・タカシ")
        user2.nick_name must equalTo("オカモト・タカシ")
      }
    }

    "find user by nick_name" in new WithApplication {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase("prov_user"))) {
        val Some(user3) = User.findByNickname("オカモト・タカシ")
        user3.user_id must equalTo("okamoto")
      }
    }

    "findAll user" in new WithApplication {
      running(FakeApplication( additionalConfiguration = inMemoryDatabase("prov_user")) ) {
        val users = User.findAll
        users.size must equalTo(1)
      }
    }

  }



}
