val someNumbers = List(-11, -10, -5, 0, 5, 10)

someNumbers.foreach(println _ )
someNumbers.foreach(println)


//filter
println(someNumbers.filter(_ > 0))

def sum(a: Int, b: Int, c: Int) = a + b + c;

val a = sum _

println(a(2,2,2))

val b = sum(1, _: Int, 3)

println(b(2))
