file:///C:/Users/Sachith/Desktop/Scala-Course/scala/case_class.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 564
uri: file:///C:/Users/Sachith/Desktop/Scala-Course/scala/case_class.scala
text:
```scala
case class point(x: Int, y: Int) {
  def a: Int = x;
  def b: Int = y;
}

case class clockTime(hour:Int , min:Int){
    def hour: Int = hour;
    def min: Int = min;
}

def main(args: Array[String]): Unit = {
  val p = point(0, 1);
  val q = point(2, 3);
  val r = point(1, 2);
  val p1 = p.copy();
  val p2 = p.copy(x = 2, y = 1)

  val pType = (p: point) =>
    p match {
      case point(0, 0) => "On Origin";
      case point(0, _) => "X axis";
      case point(_, 0) => "Y axis";
      case _           => "In area";
    }
  val print(@@)
}

```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2607)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:92)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner