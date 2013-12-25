def boom(x: Int): Int ={
	if (x == 0) throw new Exception("boom!")
	else boom(x - 1) + 1 //not tailrecursive because of + 1 after recursive call
}

boom(3)
