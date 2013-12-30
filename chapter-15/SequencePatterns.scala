def sequencematching(expr: Any) : Unit = {
  expr match {
  case List(0,_,_) => println("found list starting with 0")
  case List(_,0,_) => println("found list with 0 as second element")
  case _ => println("default")
}
}

val abba = List(0,1,2)
sequencematching(abba)

val lolzy = List(1,0,2)
sequencematching(lolzy)

val roflmao = List(1,2,3)
sequencematching(roflmao)

