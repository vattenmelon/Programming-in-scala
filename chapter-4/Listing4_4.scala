import ChecksumAccumulator.calculate

//Application is deprecated, use App instead says the 2.10 compiler. book is for 2.8
object FallWinterSpringSummer extends App {
	for (season <- List("fall", "winter", "spring"))
		println(season + ": " + calculate(season))
}
