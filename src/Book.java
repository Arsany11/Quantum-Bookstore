public class Book {
    private String isbn;
    private String title;
    private int year;
    private double price;
    private int stock;
    private BookType type;

    public Book(String isbn, String title,  int year, double price, int stock, BookType type) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.stock = stock;
        this.type = type;
    }

    public String getIsbn() { return isbn; }
    public String getType() { return type.toString(); }


    public int getYear() { return year; }

    public boolean isAvailableForSale() {
        return type.availableForSale();
    }

    public double buy(int quantity, String email, String address) throws Exception {
        double total = type.buy(this, quantity, price, stock, email, address);
        stock -= quantity;
        return total;
    }

    @Override
    public String toString() {
        return String.format(" Book[ISBN=%s, Title=%s, Author=%s, Year=%d, Price=%.2f, Stock=%d]",
                isbn, title, year, price, stock);
    }
}
