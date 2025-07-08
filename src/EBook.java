public class EBook implements BookType {
    private Service service;
        public EBook(){
            service = new EmailService();
        }
    @Override
    public boolean availableForSale() {
        return true;
    }
    @Override
    public String toString(){
        return "EBook ";
    }
    @Override
    public double buy(Book book ,int quantity, double price, int currentStock,String email, String address) throws Exception {
        if (quantity != 1) {
            throw new Exception("Quantum book store - Can only buy 1 eBook at a time.");
        }
        service.deliver(book, email, address);
        return price;
    }
}
