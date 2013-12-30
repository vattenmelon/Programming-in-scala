val fruits = List("orange", "apple", "pear")

println(fruits.tail) //all elements exept first ("head")
println(fruits.head) //first eleent
println(fruits.last)

println(fruits)
println(fruits.reverse)

println("drop 2: " + (fruits drop 2))
println("take 2: " + (fruits take 2))

val a = List(List(1,2), List(3))
println(a)
println(a.flatten)

val b = List("a", "b", "c")
val c = List(1, 2, 3)
val d = b zip c
println(d)
val e = d.unzip
println(e)

println(fruits.toString)
println(fruits mkString ",")
println(fruits mkString ("|",",","|"))

val arr = fruits.toArray
println(arr)
println(fruits.iterator.next)
