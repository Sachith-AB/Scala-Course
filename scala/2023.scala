def exam(x: (Int, Int) => Int, y: Int): Int = x(2, y)

def blast(n: Int): Unit = {
  if (n <= 1) {
    println("BlastOff");
  } else {
    blast(n - 1);
  }
}

def printA(finish: Int, n: Int): Unit = {
  if (n > finish) {
    return
  } else {
    println("a = " + n)
    printA(n + 1, finish)
  }
}

def GCD(a: Int, b: Int): Int = b match {
  case 0          => a
  case x if x > a => GCD(x, a)
  case _          => GCD(b, a % b)

}

def power(value: Int, po: Int): Int = po match {

  case 1 => value
  case _ => value * power(value, po - 1)
}

def factorial(n: Int): Int = n match {
  case 0 => 1
  case _ => n * factorial(n - 1)
}

def triangle(n: Int): Unit = {

  if (n < 1) {
    return
  } else {
    triangle(n - 1)
    for (i <- 1 to n) { // Corrected for loop syntax
      print(i + " ") // Print numbers in the same line with a space
    }
    println() // Move to the next line after printing each row
  }
}

def fixBuzz(n: Int): Unit = {
  if (n < 1) return // Base case: stop recursion when n < 1

  n match {
    case x if (x % 3 == 0 && x % 5 == 0) => println("FIZZBUZZ")
    case x if (x % 3 == 0)               => println("FIZZ")
    case x if (x % 5 == 0)               => println("BUZZ")
    case _ => println(n) // Print the number if none of the conditions match
  }

  fixBuzz(n - 1) // Recursive call to check the next number
}

def isEven(n: Int): Boolean = n match {
  case 0 => true
  case _ => isOdd(n - 1)
}
def isOdd(n: Int): Boolean = !isEven(n)

val evenOrOdd = (a: Int) =>
  a % 2 match {
    case 0 => "Even"
    case _ => "Odd"
  }

val event = (n: Int) => if (n % 2 == 0) true else false

def main(args: Array[String]): Unit = {
  print(triangle(4))
}
