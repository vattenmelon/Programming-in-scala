var assertionsEnabled = false 

def byNameAssert(predicate: => Boolean) = 
	if (assertionsEnabled && ! predicate)
		throw new AssertionError


byNameAssert(5 < 3)

assertionsEnabled = true 
println("nå skal det feile")
byNameAssert(5 < 3)

