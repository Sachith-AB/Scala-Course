import scala.io.StdIn.readLine

def filterEvenNumbers(numbers: List[Int]): List[Int] = {
  numbers.filter(num => num % 2 == 0)
}

def main(args: Array[String]): Unit = {
  println("Enter a list of integers separated by spaces:")

  // Read user input and split it into a list of integers
  val input = readLine()
  val numberList = input.split(" ").map(_.toInt).toList

  // Filter even numbers using the filterEvenNumbers function
  val evenNumbers = filterEvenNumbers(numberList)

  println(s"Even numbers: $evenNumbers")
}

