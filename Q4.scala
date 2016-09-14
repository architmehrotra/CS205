object Q4 {
	def main(args: Array[Int]){
		def Insert (x: Int, sortedlist:List[Int]) :List[Int] = sortedlist match{
           case Nil => List(x)
           case y::ys => if  (x <= y) x::y::ys else y::Insert(x,ys)
       }
		def Sort(lst: List[Int]): List[Int] = {
			lst match {
			case Nil => Nil
			case hd::tail => Insert(hd,Sort(tail))
			}
		}
	Console.println(Sort(List(2,8,6,9,4,6,2,5,1,5,0,3)))   
	}
}