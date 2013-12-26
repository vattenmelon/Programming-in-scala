abstract class Element{
  def contents: Array[String] //abstract method
  
  def height: Int = contents.length //concrete method
  def width: Int = if (height == 0) 0 else contents(0).length
}
