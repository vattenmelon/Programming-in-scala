class ChecksumAccumulator {
	private	var sum = 0

	def add(b: Byte): Unit = {
		sum += b
	}

	def checksum(): Int = {
		return ~(sum & 0xFF) + 1
	}
}

import scala.collection.mutable.Map

object ChecksumAccumulator {

	private val cache = Map[String, Int]()

	def calculate(s : String): Int = {
	if (cache.contains(s))
		cache(s) //returns from cache

	else{
		val acc = new ChecksumAccumulator
		for (c <- s)	//for hver bokstav i stringen
			acc.add(c.toByte)

		val cs = acc.checksum()
		cache += (s -> cs) //legger inn i map med s som key og cs som value
		cs //return s
	}
	}

}
