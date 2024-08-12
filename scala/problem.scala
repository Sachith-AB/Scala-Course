def convertTemperature(temp: Double): Double = {
    return (temp * 1.800)+32.00
}

def volumeSphere(radius: Double): Double = {
    return 4/3*Math.PI*radius*radius*radius
}

def main (args: Array[String]): Unit = {
    var celcius = 1
    var faranhite = convertTemperature(celcius)
    var radius = 5
    var volume = volumeSphere(radius)
    println(faranhite)
    println(volume)
}