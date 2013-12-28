import org.scalatest._
import Element.elem

class ElementSpec extends FlatSpec with Matchers {

  "An element" should "have a width" in {
    val ele = elem('x', 2, 3)
    ele.width should be (2)
  }

  it should "have a height" in {
    val ele = elem('x', 2, 3)
    ele.height should be (3)
  }

  it should "have a toString" in {
    val ele = elem('x', 2, 3)
    ele.toString should not be (null) 
  }
}
