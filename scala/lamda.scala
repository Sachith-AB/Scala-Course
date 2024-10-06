def doubleList(list: List[Int]): List[Int] = {
  return list.map(x => x * 2)
}

def commonNumber(list1: List[Int], list2: List[Int]): List[Int] = {
  val f = (list: List[Int], x: Int) => if (list.contains(x)) true else false
  return list1.filter(x => f(list2, x))
}

def countOdd(list: List[Int]): Int = {
  var length = 0
  list.map(x => if (x % 2 == 0) false else length = length + 1)
  return length;
}

def main(args: Array[String]): Unit = {
  val list1 = List(1, 2, 3, 4, 5)
  val list2 = List(6, 2, 4, 10, 8)
  val count = countOdd(list1)
  print(count)

}
