def main(args: Array[String]): Unit = {
  val l = List("a", "bb", "ccc", "dddd");

  l.map(x => println(x + "-" + x.length()))
}
