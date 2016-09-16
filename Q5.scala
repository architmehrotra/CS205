object Q5{
	
	def main(args:Array[String]):Unit= {
	
	def pivotSort(inputlist:List[Int], inputnum:Int):List[Int]=
	{
		inputlist match {
			case Nil => List(inputnum)
			case head::rest if (head <= inputnum) => head::pivotSort(rest,inputnum)
			case head::rest if (head > inputnum) => pivotSort(rest,inputnum) ::: List(head)
		}	
	}
		println("Sample list is (24,3,41,16,72); inserting element 6:"+pivotSort(List(24,3,41,16,72),6))
	}
}