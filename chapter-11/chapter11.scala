println(42.toString)
println(42.hashCode)
println(42 equals 42)


//works because of implicit conversion to scala.runtime.RichInt
println(42 max 43)
println(42 min 43)
println(1 until 5)
println(1 to 5)
println(3.abs)
println((-3).abs)
println(-3.abs)

def isEquals(x: Int, y: Int) = x == y
println(isEquals(423, 423))

def isEquals(x: Any, y: Any) = x == y
println(isEquals(423, 423))

val x = "abcd".substring(2)
val y = "abcd".substring(2)
//== works as it should on strings in scala
println(x == y)

val x2 = new String("abc")
val y2 = new String("abc")

println(x2 == y2)
println(x2 eq y2) //eq is like == in java, checks for reference equality and cannot be overriden
println(x2 ne y2) //not equal, opposite of eq

def error(message: String): Nothing = {
  throw new RuntimeException(message)
}

def divide(x: Int, y: Int): Int = {
  if (y != 0) x / y
  else error("can't divide by zero")
}

println(divide(50,2))

println(divide(50, 0))
