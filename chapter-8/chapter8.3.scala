val someNumbers = List(-11, -10, -5, 0, 5, 10)

someNumbers.foreach((x: Int) => println(x))

//filter
println(someNumbers.filter((x: Int) => x > 0))
