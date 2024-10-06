trait Color {
  var color: Int = 0 // Initialize color

  // Corrected method signature for setColor
  def setColor(x: Int): Unit = {
    color = x
  }

  // Corrected color match for output
  def printColor: String = color match {
    case 1 => "Red"
    case 2 => "Yellow"
    case 3 => "Green" // Corrected "Grenn" to "Green"
    case _ => "Error"
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val colo = new Color {} // Correct instantiation of the trait
    colo.setColor(2) // Set the color to 2 (Yellow)
    println(colo.printColor) // Should print "Yellow"
  }
}
