object MainApp {
  // Function to calculate the area of a circle given its radius
  def area(radius: Int): Double = {
    Math.PI * radius * radius
  }

  // Function to convert Celsius to Fahrenheit
  def convertTemp(temp: Double): Double = {
    temp * 1.8000 + 32.00
  }

  // Function to calculate the volume of a sphere given its radius
  def volume(radius: Double): Double = {
    4.0 / 3.0 * Math.PI * Math.pow(radius, 3)
  }

  // Function to calculate the price based on quantity with a discount and shipping cost
  def calculatePrice(qty: Int): Double = {
    if (qty > 50) {
      ((qty - 50) * 0.75) + (24.95 * 0.4 * qty) + 3
    } else {
      (qty * 24.95 * 0.4) + 3
    }
  }

  // Function to calculate run time given a destination and time
  def runTime(destination: Int, time: Int): Int = {
    destination * time
  }

  // Main function to call and demonstrate the above functions
  def main(args: Array[String]): Unit = {
    // Example usage of area function
    val circleRadius = 5
    println(s"The area of a circle with radius $circleRadius is ${area(circleRadius)}")

    // Example usage of convertTemp function
    val celsiusTemp = 25.0
    println(s"$celsiusTemp°C is equal to ${convertTemp(celsiusTemp)}°F")

    // Example usage of volume function
    val sphereRadius = 3.0
    println(s"The volume of a sphere with radius $sphereRadius is ${volume(sphereRadius)}")

    // Example usage of calculatePrice function
    val quantity = 60
    println(s"The price for $quantity items is ${calculatePrice(quantity)}")

    // Example usage of runTime function
    val destination = 100
    val time = 2
    println(s"The run time for destination $destination and time $time is ${runTime(destination, time)}")
  }
}
