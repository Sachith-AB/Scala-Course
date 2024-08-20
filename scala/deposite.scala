def deposite(amount : Double) : Double = amount match {

    case amount if amount > 1000 && amount < 10000 => amount/20;
    case amount if amount > 10000 && amount < 100000 => (amount*6)/100;
    case amount if amount > 100000 && amount < 1000000 => (amount*7)/100;
    case amount if amount > 1000000 => (amount*8)/100;
}

def balance(amount:Double): Double = {
    return deposite(amount)+amount;
}

def main(args : Array[String]): Unit = {

    println(balance(1001));
}