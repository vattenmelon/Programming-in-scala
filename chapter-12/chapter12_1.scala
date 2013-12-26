class Animal
trait HasLegs

trait Philosophical {
  def philosophize(){
    println("I consume memory, therefore I am!")
  }
}

class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"
  override def philosophize() {
    println("It ain't easy being " + toString + "!")
  }
}

val phrog: Philosophical = new Frog
phrog.philosophize()

