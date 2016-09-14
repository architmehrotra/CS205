object Q2{
	def main(args: Array[String]){}
		def splitlist(lst: List[Int]): (List[Int], List[Int])= {	
		lst match{
			case Nil => (Nil, Nil)
			case hd::tail if lst.length==1 => (List(hd)) 
			case hd::tail if lst.length>1 => (hd::Split(tail.init)._1::List(lst.last))
		}
		}
		Console.println(splitlist(List(1,2,3,4,5,6,7,8,9)))
}