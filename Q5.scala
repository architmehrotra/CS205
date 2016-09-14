object Q5 {
	def main(args: Array[String]){
		def pivotSort(lst: List[Int], x: Int): List[Int] = {
			lst match {
				case Nil => x::lst
				case hd::tail => if(hd<=x){
					hd::pivotSort(tail, x)
					}
					else {
						pivotSort(tail, x) ::: List(hd)
						}
					
					}
		}
		Console.println(pivotSort(List(4,8,5,2,9,6), 7))
	}
}