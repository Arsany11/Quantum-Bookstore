public interface BookType {
    boolean availableForSale();
    String toString ();
    double buy(Book book ,int quantity, double price, int currentStock, String email, String address) throws Exception;
}
