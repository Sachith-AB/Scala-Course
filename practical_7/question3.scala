def isPrime(n: Int): Boolean = {
  if (n <= 1){
    return false;
  }
  else if (n == 2){
    return true;
  }
  else if (n % 2 == 0){
    return false;
  }
  else{
    return !(3 to math.sqrt(n).toInt by 2).exists(i => n % i == 0)
  }
}

def filterPrime(numbers: List[Int]): List[Int] = {
  numbers.filter(isPrime)
}

def main(args: Array[String]): Unit = {
  println("Enter a list of integers separated by spaces:")

  val input = scala.io.StdIn.readLine()
  val numberList = input.split("\\s+").collect {
    case str if str.forall(_.isDigit) => str.toInt
  }.toList

  val primeNumbers = filterPrime(numberList)

  println(s"Prime numbers: $primeNumbers")
}

