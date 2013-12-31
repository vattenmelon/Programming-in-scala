import scala.collection.mutable.ArrayBuffer

val buf = new ArrayBuffer[Int]() //without length
buf += 12
buf += 13

println(buf)
println(buf.length)
println(buf(0))
println(buf(1))
