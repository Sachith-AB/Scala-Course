file:///C:/Users/Sachith/Desktop/Scala-Course/scala/HOF.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 360
uri: file:///C:/Users/Sachith/Desktop/Scala-Course/scala/HOF.scala
text:
```scala
val sayHello = (callback: () => Unit) => {
  callback();
}

val helloKasun = () => println("Hello, Kasun")

val add = (x: Int, y: Int) => {
  x + y
}

val multipy = (x: Int, y: Int) => {
  x * y
}

val f = (op: (Int, Int) => Int, x: Int, y: Int) => {
  op(x, y);
}

val cubic = (x:Int) => x*x*x;
val square = (x:Int) => x*x;

val sum = (o[@@])
def main(args: Array[String]): Unit = {
  println(f(add, 1, 2));
}

```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2607)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:96)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner