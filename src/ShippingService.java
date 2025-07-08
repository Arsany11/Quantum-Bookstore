public class ShippingService implements Service{
    @Override
    public void deliver(Book book ,String email, String address) {
        System.out.print (" Book [" + book.getIsbn() + "] sent to " + address+" .");

    }
}
