case class child(name: String, age: Int)

def main(args: Array[String]): Unit = {
  var children = List(
    child("Nuwan", 9),
    child("Kulunu", 8),
    child("Chamath", 11),
    child("Nimal", 13)
  )
  var decendingChildrern = children.sortBy(_.age).reverse
  decendingChildrern.map(x =>
    (
      println(x.name + " is " + x.age + " years old ")
    )
  )
}
