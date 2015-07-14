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

  /*
   * テスト形式
   *
   * "テストの大きなくくり" should {
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

  "factorial test" should {
    "1 factorial numbers is" in {
      factorial(1) === 1
    }

    "5 factorial numbers is" in {
      factorial(5) === 120
    }

    "-4 factorial numbers is" in {
      factorial(-4) === -24
    }
  }


  def add(x: Int, y: Int): Int = x+y

  "add test main" should {
    "test1" in {
      add(5,6) === 11
    }
    "test2" in {
      add(1243,345) === 1588
    }
    "test3" in {
      "Hello World" === "Hello World"
    }
  }

  val factorial = (n: Int) => {
    @annotation.tailrec
    def loop(num: Int, sum: Int): Int = (num, sum) match {
      case (0, sum) => sum
      case (num, sum) => loop(num - 1, sum * num)
    }
    loop(n, 1)
  }


}
