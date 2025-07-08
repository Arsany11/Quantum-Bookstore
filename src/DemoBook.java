public class DemoBook implements BookType {
    @Override
    public boolean availableForSale() {
        return false;
    }
    @Override
    public String toString(){
        return "DemoBook ";
    }
    @Override
    public double buy(Book book, int quantity, double price, int currentStock, String email, String address) throws Exception {
        throw new Exception(" Demo book [" + book.getIsbn() + "] is not for sale.");
    }

}
