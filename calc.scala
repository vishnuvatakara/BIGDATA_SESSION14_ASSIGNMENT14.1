object calc {
  def main(args:Array[String]){
    //create object of class calculator passing inputs
    val result = new Calculator(10,10) 
    //calling functions
    result.sum()
    result.sum(10)
    result.mul()
    result.mul(10)
    result.sub()
    result.div()
    result.gcd(15,25)
  }
}