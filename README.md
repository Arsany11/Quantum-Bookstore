# 📚 Quantum Book Store

Quantum Book Store is a simplified inventory and sales management system for an online bookstore.  
It demonstrates solid Object-Oriented Programming (OOP) principles including encapsulation, composition over inheritance, polymorphism, and extensibility.

> 🧪 This is Task 2 for the Fawry Rise Journey Full Stack Internship Challenge.

---

## 🚀 Features

- Add different types of books to inventory
- Support three types of books:
  - **PaperBook** – physical copy, limited stock, ships to an address
  - **EBook** – digital copy, sent via email
  - **DemoBook** – not for sale or delivery (e.g., previews or showcase)
- Buy a book by ISBN and quantity
- Automatically handle delivery based on book type
- Remove outdated books published before a given number of years

---

## 🔧 Technologies Used

- Java (JDK 8+)
- Standard Console I/O
- Object-Oriented Design

---

## 🧱 Project Structure

src/
│
├── Main.java # Runs the bookstore simulation
├── Book.java # Represents a book with metadata and business logic
│
├── BookType.java # Interface for book-type behavior
├── PaperBook.java # PaperBook type (with shipping)
├── EBook.java # EBook type (with email delivery)
├── DemoBook.java # Not-for-sale showcase book
│
├── Service.java # Interface for delivery services
├── ShippingService.java # Ships physical books
├── EmailService.java # Sends digital books
├── NoDeliveryService.java # Blocks delivery for demo books
│
├── QuantumBookstore.java # Handles inventory, buying, and removing books

## ▶️ How to Run

1. Clone the repository or copy the source code into your IDE.
2. Ensure all `.java` files are in the same package or folder (or adjust accordingly).
3. Compile and run `Main.java`.

```bash
javac *.java
java Main

## 📌 Sample Output

- `Quantum book store - Added book: P123`
- `Quantum book store - Added book: E456`
- `Shipped Done`
- `Quantum book store - Purchase successful. Total cost: $300.0`
- `Quantum book store - Email sent with eBook [E456] to arsany@example.com`
- `Quantum book store - Can only buy 1 eBook at a time.`
- `Quantum book store - Book with ISBN NOTFOUND not found.`
- `Quantum book store - Removed outdated book: P123`


