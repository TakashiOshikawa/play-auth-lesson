package models

import org.scalatest.{Matchers, WordSpec}
import play.api.test.FakeApplication
import play.api.test.Helpers.inMemoryDatabase

trait ModelSpec extends WordSpec with Matchers {

  protected val fakeApplication = () => FakeApplication(additionalConfiguration = inMemoryDatabase())

}