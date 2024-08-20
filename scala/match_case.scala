def max(a:Int, b:Int):Int = a>=b match{
    case true => a;
    case false => b;
}

def isEven(x: Int):Boolean = x%2 match{
    case 0 => true;
    case _ => false;
}

def sin(x: Int):Int = x match{

    case x if x>0 => 1;
    case x if x==0 => 0;
    case x if x<0 => -1;
}

def main(args: Array[String]): Unit = {
    print(sin(5))
}