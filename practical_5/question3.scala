object Fibonacci {

  // Function to recursively compute Fibonacci sequence and print first n numbers
  def printFibonacci(n: Int): Unit = {
    def fibonacciRecursive(num: Int): Int = {
      if (num <= 1) num
      else fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2)
    }

    if (n <= 0) {
      println("Please enter a positive integer.")
    } else {
      println("First " + n + " Fibonacci numbers:")
      for (i <- 0 until n) {
        print(fibonacciRecursive(i) + " ")
      }
      println()
    }
  }

  def main(args: Array[String]): Unit = {
    val n = 10 // Change n to the desired number of Fibonacci numbers
    printFibonacci(n)
  }
}
