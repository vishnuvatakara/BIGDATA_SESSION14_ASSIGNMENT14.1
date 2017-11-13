object calc {
  def main(args:Array[String]){
    val result = new Calculator(10,10)
    result.sum()
    result.sum(10)
    result.mul()
    result.mul(10)
    result.sub()
    result.div()
    result.gcd(15,25)
  }
}