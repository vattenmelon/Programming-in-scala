import java.io.File
import java.io.PrintWriter

def withPrintWriter(file: File, op: PrintWriter => Unit) {
	val skriver = new PrintWriter(file)
		try{
			op(skriver)
		}finally{
			skriver.close()
		}

}

withPrintWriter(
		new File("date.txt"),
		lolzy => lolzy.println(new java.util.Date) //same as (lolzy: PrintWriter) => lolzy.println(....
	       )
