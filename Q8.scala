object Q8 {
       def Permutations(lst:List[Int]):List[List[Int]] = lst match {
             case Nil => List(Nil)
             case List(a) => List(lst)
             case _ =>
                 (for(i <- lst.indices.tolist) yield {
                 val (before,rest) = lst.splitAt(i)
                 val elem = rest.head
                 val subpermutes = Permutations(before ++ rest.tail)
                 subpermutes.map(elem::_)
                 }).flatten
        }
}