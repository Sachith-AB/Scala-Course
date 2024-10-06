file:///C:/Users/Sachith/Desktop/Scala-Course/scala/2023.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sachith/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1651
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

def power(value: Int, po: Int): Int = po match {
  case 0 => 0
  case 1 => value
  case _ => value * power(value, po - 1)
}

def factorial(n: Int): Int = n match {
  case 0 => 1
  case _ => n * factorial(n - 1)
}

def triangle(n: Int): Unit = {

  if (n < 1) {
    return
  } else {
    triangle(n - 1)
    for (i <- 1 to n) { // Corrected for loop syntax
      print(i + " ") // Print numbers in the same line with a space
    }
    println() // Move to the next line after printing each row
  }
}

def fixBuzz(n: Int): Unit = {
  if (n < 1) return // Base case: stop recursion when n < 1

  n match {
    case x if (x % 3 == 0 && x % 5 == 0) => println("FIZZBUZZ")
    case x if (x % 3 == 0)               => println("FIZZ")
    case x if (x % 5 == 0)               => println("BUZZ")
    case _ => println(n) // Print the number if none of the conditions match
  }

  fixBuzz(n - 1) // Recursive call to check the next number
}

def isEven(n: Int): Boolean = n match {
  case 0 => true
  case _ => isOdd(n - 1)
}
def isOdd(n: Int): Boolean = !isEven(n)

def countBids(a: Int, b: Int): Int = {}

val evenOrOdd = (a: Int) =>
  a % 2 m@@ {
    case 0 => "Even"
    case _ => "Odd"
  }
def main(args: Array[String]): Unit = {
  println(evenOrOdd(5))
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