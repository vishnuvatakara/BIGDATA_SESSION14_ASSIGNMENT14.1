class Calculator (a:Int,b:Int){
  val num1 :Int = a
  val num2 : Int = b
  def sum():Unit = {println("sum  =" + (num1 + num2))}
  def sum(c:Int):Unit = {println("sum overloading = " + (num1 + num2 + c))}
  def sub():Unit = {println("difference = " + (num1 - num2))}
  def mul():Unit = {println("multiplication = " + (num1 * num2))}
  def mul(e:Int):Unit = {println("multiplication overloading = " + (num1 * num2 * e))}
  def div():Unit = {println("division = " + (num1 / num2))} 
  def gcd(a: Int,b: Int): Unit = {
       if(b ==0) {println("GCD = "+ a)} else gcd(b, a%b)
    }
}