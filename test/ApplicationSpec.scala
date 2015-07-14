import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends Specification {

  //  "Application" should {
  //
  //    "send 404 on a bad request" in new WithApplication{
  //      route(FakeRequest(GET, "/boum")) must beNone
  //    }
  //
  //    "render the index page" in new WithApplication{
  //      val home = route(FakeRequest(GET, "/")).get
  //
  //      status(home) must equalTo(OK)
  //      contentType(home) must beSome.which(_ == "text/html")
  //      contentAsString(home) must contain ("Your new application is ready.")
  //    }
  //  }

  /*
   * テスト形式
   *
   * "テストのかたまり" should {
   *   "テストタイトル" in {
   *     テスト対象 must 結果判定
   *   }
   * }
   *
   */

  "The 'Hello world ' string" should {
    "contain 11 characters" in {
    "Hello world" must have size (11)
    }
    "start with 'Hello'" in {
    "Hello world" must startWith ("Hello")
    }
    "end with 'world'" in {
    "Hello world" must endWith ("world")
    }
  }


  def add(x: Int, y: Int): Int = x+y

  "add test main" should {
    "test1" in {
//      add(5,6) must_== 11
      add(5,6) === 11
    }
    "test2" in {
      "Hello World" === "Hello World"
    }
  }


}
