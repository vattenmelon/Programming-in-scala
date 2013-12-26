class Rational(n: Int, d: Int) extends Ordered[Rational]{ //primary constructor
require(d != 0)
private val g = gcd(n.abs, d.abs)
val numer: Int = n / g
val denom: Int = d / g

def this(n: Int) = this(n, 1) // auxilliary constructor, aux.constructors må kalle andre constructorer.
override def toString = numer + "/" + denom

//zero if objects are same, negative if this is less than argument, positive if this is larger than argument
def compare(that: Rational) = { 
  (this.numer * that.denom) - (that.numer * this.denom)
}

def + (that: Rational): Rational = { // a + b is same as a.+(b)
new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
    }

    def + (i: Int): Rational = {
      new Rational(numer + i * denom, denom)
    }

    def - (that: Rational):Rational  = {
      new Rational(
        numer * that.denom - that.numer * denom,
        denom * that.denom
      )
  }

  def - (i: Int): Rational = {
    new Rational(numer - i * denom, denom)
  }

  def * (that: Rational): Rational = {
    new Rational(numer * that.numer, denom * that.denom)
  }

  def * (i: Int): Rational = {
    new Rational(numer * i, denom)
  }

  def / (that: Rational): Rational = {
    new Rational(numer * that.denom, denom * that.numer)
  }

  def / (i: Int): Rational = {
    new Rational (numer, denom * i)
  }

  def lessThan(that: Rational) = {
    this.numer * that.denom < that.numer * this.denom
  }

  def max(that: Rational) = {
    if (this.lessThan(that)) that else this //den første this er valgfri, den andre er det ikke. 
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
    }
}

//script
val half = new Rational(1, 2)
val third = new Rational(1, 3)
println("half is less than third: " + (half < third))
println("half is larger than third: " + (half > third))
