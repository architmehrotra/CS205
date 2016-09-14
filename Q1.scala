object Q1 {
	def main(args: Array[String]): Unit = {
		def fact(x: Int): Int = 
			x match {
                        case 0 => 1
			case x => x*fact(x-1)}
			Console.println("Factorial 8 is" + fact(8))	
	
	}
}