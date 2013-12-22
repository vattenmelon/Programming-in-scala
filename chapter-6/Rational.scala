//implicit conversion: implicit def intToRational(x: Int) = new Rational(x)
//for å kunne si f.eks 2 * r .

class Rational(n: Int, d: Int){ //primary constructor
	require(d != 0)
	private val g = gcd(n.abs, d.abs)
	val numer: Int = n / g
	val denom: Int = d / g

	def this(n: Int) = this(n, 1) // auxilliary constructor, aux.constructors må kalle andre constructorer.
	override def toString = numer + "/" + denom

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
