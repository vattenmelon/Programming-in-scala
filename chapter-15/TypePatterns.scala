def typematching(expr: Any) : Unit = {
  expr match {
  case s: String => println("argument is a string with length: " + s.length)
  case m: List[Any] => println("argument is a list")
  case x: Int => println("argument is a int with value: " + x)
  case _ => println("default")
}
}

val abba = List(0,1,2)
typematching(abba)

val lolzy = "heipådeg" 
typematching(lolzy)

val tall = 2
typematching(tall)

typematching(true)
