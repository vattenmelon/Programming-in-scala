def echo(args: String*){ //repeated arguments (varargs)
	for (arg <- args){
		println(arg)
	}

}

echo("hest", "er", "best")

echo("lol")

echo()

val array = Array("hei", "på", "deg");

echo(array:_*) //tells compiler to pass each element of array as its own argument
