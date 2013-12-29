def metode(tall: Int): Int = tall match{
  case 5 => 5 + 1
  case 10 => 10 + 1
  case _ => 0
}

println(metode(5))
println(metode(6))
println(metode(9))
println(metode(10))


def tupleDemo(expr: Any) =
  expr match {
    case (a, b, c) => println("matched " + a + b + c)
    case _ =>
  }

tupleDemo(("a", 3, "-tuple"))
