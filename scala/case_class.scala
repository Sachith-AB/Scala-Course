case class point(x: Int, y: Int) {
  def a: Int = x;
  def b: Int = y;
}

case class clockTime(hour: Int, min: Int) {
  def h: Int = hour;
  def m: Int = min;
}

def main(args: Array[String]): Unit = {
  val p = point(0, 1);
  val q = point(2, 3);
  val r = point(1, 2);
  val p1 = p.copy();
  val p2 = p.copy(x = 2, y = 1)

  val pType = (p: point) =>
    p match {
      case point(0, 0) => "On Origin";
      case point(0, _) => "X axis";
      case point(_, 0) => "Y axis";
      case _           => "In area";
    }
  val printl = (time: clockTime) =>
    time match {
      case clockTime(10, _) => "Morning"
      case clockTime(12, _) => "Afternoon"
      case _                => time
    }

  print(printl(clockTime(12, 23)))
}
