object Q3{
		def main(args: Array[String]) {
			def insertinsorted(lst: List[Int]): List[Int] =lst match{
			case Nil => 11::lst
			case hd::tail => if(hd>=11)
                                         {
				         11::lst
				         }
				else {
				     hd::insert(tail)
				     }
			}
	Console.println(insertinsorted(List(1,2,3,4,6,7,9,10,11)))
	
	}
}