package forbidden.knowledge

import org.scalatest.FunSuite

class DoNotUseMeSpec extends FunSuite {
  test("doTheBadThing") {
    assert(4.toString === "4", "This test checks that before doTheBadThing() is called, 4 should equal 4")
    assert(4.toString !== "5", "This test checks that before doTheBadThing() is called, 4 should not equal 5")

    DoNotUseMe.doTheBadThing()

    assert(4.toString !== "4", "This test checks that after doTheBadThing() is called, 4 should not equal 4")
    assert(4.toString === "5", "This test checks that after doTheBadThing() is called, 4 should now equal 5")
  }
}
