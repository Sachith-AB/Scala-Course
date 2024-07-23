import scala.io.StdIn.readLine

object InventoryManagementSystem {

 
  def getProductList(): List[String] = {
    def loop(products: List[String]): List[String] = {
      val productName = readLine("Enter product name (or type 'done' to finish): ")
      if (productName.toLowerCase == "done"){
         products
      }
      else {
        loop(products :+ productName)
      }
    }
    loop(Nil)
  }

 
  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

 
  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val products = getProductList()
    println("\nProduct List:")
    printProductList(products)
    println(s"\nTotal number of products: ${getTotalProducts(products)}")
  }
}
