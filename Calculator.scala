class Calculator (a:Int,b:Int){//class with two input arguments
  //setting input values
  val num1 :Int = a
  val num2 : Int = b
  //function sum to add two numbers a and b
  def sum():Unit = {println("sum  =" + (num1 + num2))}
  //sum overloading constructor
  def sum(c:Int):Unit = {println("sum overloading = " + (num1 + num2 + c))}
  //function for subtraction
  def sub():Unit = {println("difference = " + (num1 - num2))}
  //function multiplication
  def mul():Unit = {println("multiplication = " + (num1 * num2))}
  def mul(e:Int):Unit = {println("multiplication overloading = " + (num1 * num2 * e))}
  def div():Unit = {println("division = " + (num1 / num2))} 
  //function for gcd of numbers a and b
  def gcd(a: Int,b: Int): Unit = {
       if(b ==0) {println("GCD = "+ a)} else gcd(b, a%b)
    }
}