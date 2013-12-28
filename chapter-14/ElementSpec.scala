import org.scalatest._
import Element.elem

class ElementSpec extends FlatSpec with Matchers {
  
  val ele = elem('x', 2, 3)

  "An element" should "have a width" in {
    ele.width should be (2)
  }

  it should "have a height" in {
    ele.height should be (3)
  }

  it should "have a toString" in {
    ele.toString should not be (null) 
  }
}
