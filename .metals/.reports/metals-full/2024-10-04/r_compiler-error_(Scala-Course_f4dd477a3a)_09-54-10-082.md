file:///C:/Users/Sachith/Desktop/Scala-Course/scala/2023.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sachith/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 516
uri: file:///C:/Users/Sachith/Desktop/Scala-Course/scala/2023.scala
text:
```scala
def exam(x: (Int, Int) => Int, y: Int): Int = x(2, y)

def blast(n: Int): Unit = {
  if (n <= 1) {
    println("BlastOff");
  } else {
    blast(n - 1);
  }
}

def printA(n: Int, finish: Int): Unit = {
  if (n > finish) {
    return
  } else {
    println("a = " + n)
    printA(n + 1, finish = finish)
  }
}

def GCD(a: Int, b: Int): Int = b match {
  case 0          => a
  case x if x > a => GCD(x, a)
  case _          => GCD(b, a % b)

}

def power(value:Int , power:Int):Int = power m@@ {
  if(power === 0)
}

def main(args: Array[String]): Unit = {
  println(GCD(5, 10))
}

```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sachith/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala