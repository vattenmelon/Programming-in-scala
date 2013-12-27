abstract class IntQueue {
  def get(): Int
  def put(x: Int)

}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = {super.put(2 * x)} //super call on method declared abstract!
}

trait Incrementing extends IntQueue{
  abstract override def put(x: Int) = { super.put(x + 1)}
}

trait Filtering extends IntQueue{
  abstract override def put(x: Int) = {
   if (x > 0) super.put(x)
  }
}

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x}
}

class MyQueue extends BasicIntQueue with Doubling


//script
println("==BasicQueue==")
val q = new BasicIntQueue
q.put(10)
q.put(20)
println(q.get())
println(q.get())

println("==MyQueue==")
val m = new MyQueue 
m.put(10)
m.put(20)
println(m.get())
println(m.get())

println("==BasicQueue with Incrementing and Filtering==")
val q2 = new BasicIntQueue with Incrementing with Filtering //from right to left in order, ie. 0 gets filtered out before it can be incremented
q2.put(-1) //gets filtered out
q2.put(0) //gets filtered out
q2.put(1) //is incremented to 2
println(q2.get())

