val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

for ((country, city) <- capitals)
  println("The capital of " + country + " is " + city)
