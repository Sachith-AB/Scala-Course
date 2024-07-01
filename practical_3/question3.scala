object ArithmeticMean {
  def mean(num1: Int, num2: Int): Double = {

    def roundToTwoDecimals(value: Double): Double = {
      if (value * 100 == Math.round(value * 100)){
        return value;
      }
      else{
        roundToTwoDecimals(Math.round(value * 100) / 100.0) 
      }
    }

    val average = (num1 + num2) / 2.0
    roundToTwoDecimals(average)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val num1 = 5
    val num2 = 10
    val result = ArithmeticMean.mean(num1, num2)
    println(f"$result%.2f")
  }
}
