public class EmailService implements Service {
    @Override
    public void deliver(Book book, String email, String address) {
        System.out.print(" Email sent with eBook [" + book.getIsbn() + "] to " + email+" .");
    }
}
