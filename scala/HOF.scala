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

val cubic = (x: Int) => x * x * x;
val square = (x: Int) => x * x;

// val sum : (op: (Int) => Int, x: Int, y: Int) =>
//   if (x > y) 0 else op(x + 1) + sum(op, x + 1, y)

def adding = (x: Int) => (y: Int) => x + y

def netProfite = (price: Int) => (cost: Int) => price * 100 - cost

def main(args: Array[String]): Unit = {
  println(netProfite(10000)(200));
}
