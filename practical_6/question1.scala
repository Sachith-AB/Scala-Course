object InventorySystem extends App {
  // Define the structure of a Product using a case class
  case class Product(name: String, quantity: Int, price: Double)

  // Define the inventories using Scala Maps
  var inventory1: Map[Int, Product] = Map(
    101 -> Product("Laptop", 10, 999.99),
    102 -> Product("Smartphone", 20, 499.99),
    103 -> Product("Tablet", 15, 299.99)
  )

  val inventory2: Map[Int, Product] = Map(
    102 -> Product("Smartphone", 5, 450.00),
    104 -> Product("Headphones", 30, 59.99)
  )

  // I. Retrieve all product names from inventory1
  def getAllProductNames(inventory: Map[Int, Product]): Seq[String] = {
    inventory.values.map(_.name).toSeq
  }

  // II. Calculate the total value of all products in inventory1
  def calculateTotalValue(inventory: Map[Int, Product]): Double = {
    inventory.values.map(product => product.quantity * product.price).sum
  }

  // III. Check if inventory1 is empty
  def isInventoryEmpty(inventory: Map[Int, Product]): Boolean = {
    inventory.isEmpty
  }

  def updatePrice(inventory: Map[Int, Product], productId: Int , newValue: Double): Unit = {
    inventory.get(productId) match {
      case Some(product) =>
        case class updateProduct(name: String, quantity: Int, price: Double)

        102 -> updateProduct("Smartphone", 5, newValue);
        println(s"Product ID: $productId, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${newValue}")
        
      case None =>
        println(s"Product with ID $productId does not exist in the inventory.")  
    }
  }

  // IV. Merge inventory1 and inventory2, updating quantities and retaining the highest price
  def mergeInventories(inv1: Map[Int, Product], inv2: Map[Int, Product]): Unit = {
    inv2.foldLeft(inv1) { case (acc, (id, product)) =>
      acc.get(id) match {
        case Some(existingProduct) =>
          acc.updated(id, Product(
            existingProduct.name,
            existingProduct.quantity + product.quantity,
            math.max(existingProduct.price, product.price)
          ))
        case None =>
          acc + (id -> product)
      }
    }
  }

  // V. Check if a product with a specific ID (e.g., 102) exists and print its details
  def printProductDetailsIfExists(inventory: Map[Int, Product], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some(product) =>
        println(s"Product ID: $productId, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
      case None =>
        println(s"Product with ID $productId does not exist in the inventory.")
    }
  }

  // Execute the operations
  println("I. Product Names in Inventory 1:")
  println(getAllProductNames(inventory1))

  println("\nII. Total Value of Inventory 1:")
  println(calculateTotalValue(inventory1))

  println("\nIII. Is Inventory 1 Empty?")
  println(isInventoryEmpty(inventory1))

  println("\nIV. Merging Inventories:")
  val mergedInventory = mergeInventories(inventory1, inventory2)
  println(mergedInventory)

  println("\nV. Check and Print Product ID 102 Details:")
  printProductDetailsIfExists(inventory1, 102)

  println("\nVI. Update and Print Product ID 102 Details:")
  updatePrice(inventory1, 102, 200.99)

}
