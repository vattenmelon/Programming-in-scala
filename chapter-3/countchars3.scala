import scala.io.Source

if (args.length > 0){

	val lines = Source.fromFile(args(0)).getLines().toList

	def widthOfLength(s: String) = s.length.toString.length

	var maxWidth = 0
	lines.foreach(line => maxWidth = maxWidth.max(widthOfLength(line)))
	
	def formatLines(lines: List[String]) :  List[String] =  {
		var liste = List[String]()
		for (line <- lines){
			val numSpaces = maxWidth - widthOfLength(line)
			val padding = " " * numSpaces
			liste = padding + line.length + " | " + line :: liste 
		}
		return liste.reverse;
	}

	formatLines(lines).foreach(println)
}else
	Console.err.println("Please enter a filename");

