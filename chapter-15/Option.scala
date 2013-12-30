val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

println(capitals get "France")

println(capitals get "France" get)

println(capitals get "Norway")

println(capitals get "Norway" getOrElse "no capital")
