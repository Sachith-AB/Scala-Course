def sumOfOddNumber(list: List[Int]): Int = {
  list.filter(x => x % 2 != 0).reduce((x, y) => x + y);
}

def count(list: List[Int]): Int = {
  list.reduce((x, y) => x + y)
}

def removeSign(list: List[Int]): List[Int] = {
  list.map(x => math.abs(x))
}

def triangle(n: Int, p: Int = 1): Unit = {
  if (p > n) {
    return
  } else {
    println(p)
    triangle(p + 1)
  }
}

def sortList(list: List[Int]): List[Int] = {
  list.sorted;
}

def main(args: Array[String]): Unit = {
  val l = List(1, -2, -3, 4, -5, 34, 7)
  val double = (list: List[Int]) => list.map(x => x * 2)
  val sortList = (list: List[Int]) => list.sorted
  val add = (x: Int, y: Int) => x + y;
  val ls = removeSign(l)
  print(add(1, 2))
}
