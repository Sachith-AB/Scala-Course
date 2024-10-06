def f1 = (x: Int, y: Int) => x * y;

def f2 = (x: (Int, Int) => Int, y: Int) => x(y, y + 1) + 2;

def printA(n: Int): Unit = {
  if (n < 1) {
    return
  } else {
    print(n - 1)
  }
  print(n)
}

def A(): Unit = {
  println("A")
  A()
}
def B(): Unit = {
  println("B")
  A()
}
def C(): Unit = {
  println("C")
  B();
}
def main(args: Array[String]): Unit = {
  B();
}
