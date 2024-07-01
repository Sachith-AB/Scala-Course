object stringReverse {
  def reverseString(str: String): String = {
    if (str.isEmpty) {
      return ""
    } else {
      return reverseString(str.tail) + str.head
    }
  }

  def main(args: Array[String]): Unit = {
    val original = "hello"
    val reverse = reverseString(original)
    println(s"Original: '$original'")
    println(s"Reversed: '$reverse'")
  }
}


