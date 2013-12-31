import scala.collection.mutable.ListBuffer

val buf = new ListBuffer[Int]
buf += 1
buf += 2
buf += 3
val liste = buf.toList
println(liste)
