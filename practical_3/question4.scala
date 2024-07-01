object SumEvenNumbers {
  def sumEven(nums: List[Int]): Int = {
    nums match {
      case Nil => 0
      case head :: tail =>
        if (head % 2 == 0){
            return head + sumEven(tail)
        }
        else {
            return sumEven(tail)
        }
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumOfEvens = SumEvenNumbers.sumEven(numbers)
    println(s"Sum of even numbers: $sumOfEvens")
  }
}
