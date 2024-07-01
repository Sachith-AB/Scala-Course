object PrimeCheck {
  def isPrime(n: Int): Boolean = {
    // Helper recursive function
    def isPrimeRecursive(n: Int, divisor: Int): Boolean = {
      if (divisor * divisor > n) true
      else if (n % divisor == 0) false
      else isPrimeRecursive(n, divisor + 1)
    }

    // Check edge cases
    if (n <= 1) false
    else isPrimeRecursive(n, 2)
  }

  // Test cases
  def main(args: Array[String]): Unit = {
    println(isPrime(29))  // Output: true
    println(isPrime(30))  // Output: false
  }
}
