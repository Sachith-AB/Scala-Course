def blast (n: Int) : Unit = {
    println(n);

    if(n<=1){
        print("Blast Off");
    }else{
        blast(n-1);
    }
}

def GCD(a:Int , b:Int) : Int = b match {
    case 0 => a;
    case x if x>a => GCD(x,a);
    case _ => GCD(b,a%b);
}

def prime(p: Int , n: Int = 2):Boolean = n match {
    case x if (x==p) => true;
    case x if GCD(p,x) > 1 => false;
    case x => prime(p,x+1);
}

def exponent(value:Int , power:Int):Int = {
    var x=power;
    
    if(x==0){
        return 1;
    }
    else{
        return value*exponent(value,x-1);
    }
}

def factorial(n : Int): Int = {

    if(n==0){
        return 1;
    }else{
        return n * factorial(n-1);
    }
}

def main(args : Array[String]): Unit = {

}