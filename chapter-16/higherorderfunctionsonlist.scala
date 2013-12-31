val list = List(1,2,3)
val list2 = list map (_ + 1)
println(list2)

val fruits = List("orange", "apple", "pear")
val fruitlength = fruits map (_.length)
println(fruitlength)

println(fruits map (_.toList))
println(fruits flatMap (_.toList))

var sum = 0
list foreach (sum += _)
println(sum)


println(list filter (_ % 2 == 0))

println(fruits filter (_.startsWith("ap")))
println(fruits filter (_.length == 5 ))

println(fruits partition (_.length == 5))

println(fruits find (_.length == 5 ))
