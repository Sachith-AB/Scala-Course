import scala.io.StdIn.readLine;

def squareNum(numbers: List[Int]):List[Int] = {
    numbers.map(num => num * num);
}

def main(args: Array[String]):Unit = {
    println("Enter the number list with separated by spaces:");

    val input = readLine();
    val numberList = input.split(" ").map(_.toInt).toList;

    val squreNumber = squareNum(numberList);

    println(s"Squre Number: $squreNumber");
}