case class student(name: String, marks: Int) {}

def main(args: Array[String]): Unit = {
  val students = List(
    student("Nuwan", 60),
    student("Kulun", 70),
    student("Nimal", 50),
    student("Kasun", 80)
  )

  val totalMarks = students.map(x => x.marks).reduce((x, y) => x + y);
  val totalStudents = students.map(x => 1).reduce((x, y) => x + y)
  val decendingMarks = students.sortBy(_.marks).reverse
  println(decendingMarks)
}
