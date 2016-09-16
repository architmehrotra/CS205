object Q3{
		def main(args: Array[String]) {
			def insert(lst: List[Int], x: Int): List[Int] =
			lst match{
			case Nil => x::lst
			case hd::tail => if(hd>=x){
				x::lst
				}
				else{
					hd::insert(tail, x)
				}
			}
			Console.println("Inserting 5 in 1,2,4,6,8,9 = " + insert(List(1,2,4,6,8,9), 5))
	}
}