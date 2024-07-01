object StringFilter {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings match {
      case Nil => Nil
      case head :: tail =>
        if (head.length > 5){
            return head :: filterLongStrings(tail)
        }
        else{
            return filterLongStrings(tail)
        }
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val strings = List("sachith", "avintha", "samee", "short", "tiny", "anotherLongOne")
    val longStrings = StringFilter.filterLongStrings(strings)
    println(longStrings)
  }
}
