def discount(price: Double):Double = {
    return 0.4*price;
}

def shipping(quantity: Int):Double = {
    if(quantity<=50){
        return 3;
    }else{
        return (quantity-50)*0.75 + 3;
    }
}

def cost(price: Double, quantity: Int):Double = {
    return price + shipping(quantity) - discount(price);
}

def main(args : Array[String]): Unit = {
    val price = 24.95;
    val quantity = 60;

    println{cost(price,quantity)};
}