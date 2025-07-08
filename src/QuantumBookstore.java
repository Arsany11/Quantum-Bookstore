import java.util.*;

public class QuantumBookstore {
    private Map<String, Book> inventory;

    public QuantumBookstore() {
        this.inventory = new HashMap<>();
    }

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println(" Added "+book.getType() + book.getIsbn());
    }

    public Book removeBook(String isbn) {
        Book removed = inventory.remove(isbn);
        if (removed != null) {
            System.out.println(" Removed book: " + isbn);
        }
        return removed;
    }

    public List<Book> removeOutdatedBooks(int yearsThreshold) {
        List<Book> removed = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator();
        while (it.hasNext()) {
            Book book = it.next().getValue();
            if (currentYear - book.getYear() > yearsThreshold) {
                removed.add(book);
                it.remove();
                System.out.println(" Removed outdated book: " + book.getIsbn());
            }
        }
        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        Book book = inventory.get(isbn);
        if (book == null) {
            throw new Exception(" Book with ISBN " + isbn + " not found.");
        }

        if (!book.isAvailableForSale()) {
            throw new Exception(" Book with ISBN " + isbn + " is not for sale.");
        }

        double totalCost = book.buy(quantity, email, address);
        System.out.println(" Purchase successful. Total cost: $" + totalCost);
        return totalCost;
    }
}
