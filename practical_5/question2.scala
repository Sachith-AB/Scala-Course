import scala.collection.mutable.Set

// Define a case class for Book
case class Book(title: String, author: String, isbn: String)

// Library management object
object LibraryManagement {

  // Initial set of books in the library
  var libraryBooks: Set[Book] = Set(
    Book("Madol Doowa", "Martin Wickramasinghe", "1000"),
    Book("Thunman Handiya", "Mahagamasekara", "1234"),
    Book("Hathpana", "Kumarathunga Munidasa", "8940")
  )

  // Function to add a new book to the library
  def addBook(book: Book): Unit = {
    libraryBooks += book
    println(s"Added book: ${book.title} by ${book.author}")
  }

  // Function to remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = {
    libraryBooks.find(_.isbn == isbn) match {
      case Some(book) =>
        libraryBooks -= book
        println(s"Removed book: ${book.title} by ${book.author}")
      case None =>
        println("Book not found in the library.")
    }
  }

  // Function to check if a book exists in the library by its ISBN
  def containsBook(isbn: String): Boolean = {
    libraryBooks.exists(_.isbn == isbn)
  }

  // Function to display the current library collection
  def displayLibraryCollection(): Unit = {
    println("Current Library Collection:")
    libraryBooks.foreach { book =>
      println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})")
    }
  }

  // Function to search for a book by its title and display its details if found
  def searchByTitle(title: String): Unit = {
    libraryBooks.find(_.title.toLowerCase == title.toLowerCase) match {
      case Some(book) =>
        println(s"Book found: ${book.title} by ${book.author} (ISBN: ${book.isbn})")
      case None =>
        println("Book not found in the library.")
    }
  }

  // Function to display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = libraryBooks.filter(_.author.toLowerCase == author.toLowerCase)
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"${book.title} (ISBN: ${book.isbn})")
      }
    } else {
      println(s"No books found by $author in the library.")
    }
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    displayLibraryCollection()

    println("\nAdding a new book...")
    val newBook = Book("Magul Kama", "Kumarathunga Munidasa", "87896")
    addBook(newBook)
    displayLibraryCollection()

    println("\nSearching for a book by title...")
    searchByTitle("Madol Doowa")

    println("\nDisplaying books by a specific author...")
    displayBooksByAuthor("Kumarathunga Munidasa")

    println("\nRemoving a book by ISBN...")
    removeBook("87896")
    displayLibraryCollection()
  }
}
