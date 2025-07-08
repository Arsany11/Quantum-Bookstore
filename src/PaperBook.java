public class PaperBook implements BookType {
    private Service service;
    public PaperBook(){
        service = new ShippingService();
    }
    @Override
    public boolean availableForSale() {
        return true;
    }
    @Override
    public String toString(){
        return "PaperBook ";
    }

    @Override
    public double buy(Book book ,int quantity, double price, int currentStock ,String email, String address) throws Exception {
        if (quantity <= 0 || quantity > currentStock) {
            throw new Exception(" Not enough stock for paper book.");
        }
        service.deliver(book , email , address);
        return quantity * price;
    }
}
