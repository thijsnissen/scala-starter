import org.scalatest.funsuite.AnyFunSuite

class TestSpec extends AnyFunSuite:
  test("Main"):
    assertResult("Hello, world!")(Main.msg)
