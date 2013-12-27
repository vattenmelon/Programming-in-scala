class Fruit ( 
  val name: String,
  val color: String
)

def showFruit(fruit: Fruit) {
  import fruit._
  println(name + ": " + color)
}

//script

val abba = new Fruit("navn", "grønn")
showFruit(abba)

