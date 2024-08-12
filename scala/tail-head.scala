def sum(xs: List[Int]): Int = xs match {
    case Nil => 0
    case x :: tail => x+sum(tail)
}

def main(args: Array[String]): Unit = {
   val numbers = List(1, 2, 3, 4, 5)
   val tail = numbers.tail
   val head = numbers.head
   println(head)
}