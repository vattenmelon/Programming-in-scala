
//Application is deprecated, use App instead says the 2.10 compiler. book is for 2.8
object BankAccountApp extends App {
  val account = new BankAccount()
  account.deposit(100)
  println("satt inn 100 på konto")
  account.withdraw(50)
  println("tar ut 50")
  account.deposit(100)
  println("satt inn 100 på konto")
  println("kan ta ut 151: " + account.withdraw(151))
  println("kan ta ut 150: " + account.withdraw(150))
}
