file:///C:/Users/Sachith/Desktop/Scala-Course/scala/2022.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition printA is defined in
  C:/Users/Sachith/Desktop/Scala-Course/scala/example.scala
and also in
  C:/Users/Sachith/Desktop/Scala-Course/scala/2023.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 69
uri: file:///C:/Users/Sachith/Desktop/Scala-Course/scala/2022.scala
text:
```scala
def sumOfOddNumber(list: List[Int]): Int = {
  list.filter(x => x % @@2 != 0).reduce((x, y) => x + y);
}

def count(list: List[Int]): Int = {
  list.reduce((x, y) => x + y)
}

def removeSign(list: List[Int]): List[Int] = {
  list.map(x => math.abs(x))
}

def main(args: Array[String]): Unit = {
  val l = List(1, -2, -3, 4, -5, 6, 7)
  print(removeSign(l))
}

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition printA is defined in
  C:/Users/Sachith/Desktop/Scala-Course/scala/example.scala
and also in
  C:/Users/Sachith/Desktop/Scala-Course/scala/2023.scala
One of these files should be removed from the classpath.