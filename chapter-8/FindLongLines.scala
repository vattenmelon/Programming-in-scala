// Listing 8.1

import scala.io.Source

object LongLines {
	
	def processFile(filename: String, width: Int) {
		val source = Source.fromFile(filename)
		for (line <- source.getLines()){
			processLine(filename, width, line)
		}
	}
	private def processLine(filename: String, width: Int, line: String){
		if (line.length > width){
			println(filename + ": " + line.trim)
		}
	}

}

object FindLongLines{

	def main(args: Array[String]){
		val width = args(0).toInt
		for (arg <- args.drop(1)){ //drop(n): selects all except first n-one
			LongLines.processFile(arg, width);
		}
	}
}
