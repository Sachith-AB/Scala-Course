
//  question 1
def area(radius: Int): Double = {
    Math.PI * radius * radius
  }


// question 2
def convertTemp(temp: Double): Double = {
    temp * 1.8000 + 32.00
  }

// quetion 3
def volume(radius: Double): Double = {
    4.0/3.0 * Math.PI * Math.pow(radius,3)
    }

// question 4


def calculatePrice(qty:Int):Double = {
    if(qty>50){
        ((qty-50)*0.75) + (24.95 * 0.4 * qty) + 3
    }else{
        (qty * 24.95 * 0.4) + 3
    }
}


def runTime(destination:Int,time:Int){
    destination * time
}
    


    

  


