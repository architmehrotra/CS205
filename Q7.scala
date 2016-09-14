object Q7{
	def main(args: Array[String]) {
	def FastPower(x: Int, n: Int): Int= 
	{
		n match{
			case n => if (n%2!=0)
                        {
			x*FastPower(x,(n-1)/2)*FastPower(x,(n-1)/2)}
			else
                        {
			FastPower(x,n/2)*FastPower(x,n/2)
                        }
		}
	}
	Console.println(FastPower(6,8))
}
}