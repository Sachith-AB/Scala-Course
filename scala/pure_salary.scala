def tax(pay : Double) : Double = pay match {

    case pay if pay<50000 => 0;
    case pay if pay>50000 && pay<100000 => pay/10;
    case pay if pay>100000 => (pay/10)*2;
}

def netPay(payRate : Double , hour : Int) : Double = {

    return payRate*hour;
}

def salary(pay : Double, tax : Double) : Double = {
    
    return pay-tax;
}

def main(args : Array[String]) : Unit = {

    val payRate = 50000;
    var hour = 8;
    
    var payment = netPay(payRate,hour);
    var Tax = tax(payment);
    var profite = salary(payment,Tax);

    print(profite);
}