import scala.io.Source

if (args.length > 0){

	val lines = Source.fromFile(args(0)).getLines().toList

	def widthOfLength(s: String) = s.length.toString.length

	var maxWidth = 0
	lines.foreach(line => maxWidth = maxWidth.max(widthOfLength(line)))
	
	lines.map(line => " " * (maxWidth - widthOfLength(line)) + line.length + " | " + line).foreach(println) //fullstendig uleselig...
}else
	Console.err.println("Please enter a filename");

