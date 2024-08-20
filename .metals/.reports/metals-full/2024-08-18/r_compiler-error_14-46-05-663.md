file:///C:/Users/Sachith/Desktop/Scala-Course/scala/recurtion.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  C:/Users/Sachith/Desktop/Scala-Course/scala/pure_salary.scala
and also in
  C:/Users/Sachith/Desktop/Scala-Course/scala/tail-head.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 617
uri: file:///C:/Users/Sachith/Desktop/Scala-Course/scala/recurtion.scala
text:
```scala
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

def factorial(value : I@@

def main(args : Array[String]): Unit = {
    println(exponent(2,4));
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  C:/Users/Sachith/Desktop/Scala-Course/scala/pure_salary.scala
and also in
  C:/Users/Sachith/Desktop/Scala-Course/scala/tail-head.scala
One of these files should be removed from the classpath.