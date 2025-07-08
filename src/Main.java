public class Main {
    public static void main(String[] args) throws Exception {
        QuantumBookstore store = new QuantumBookstore();

        Book paperBook = new Book(
                "P123", "Clean Code",  2010,
                150.0, 2, new PaperBook()
        );

        Book ebook = new Book(
                "E496", "AI Fundamentals", 2023,
                60.0, 1, new EBook()
        );
        Book demoBook = new Book(
                "D456", "Fundamental of Bussnis", 2023,
                00.0, 1, new DemoBook()
        );


        store.addBook(paperBook);
        store.addBook(ebook);
        store.addBook(demoBook);

        store.buyBook("P123", 1, "arsany@fawry.com", "Cairo, Egypt");

        store.removeOutdatedBooks(5);
        store.removeBook("P123"); // try remove removed book





        store.buyBook("P123", 1, "arsany@fawry.com", "Cairo, Egypt");// after removing it cause out of date




        store.buyBook("NOTFOUND", 1, "arsany@fawry.com", "no address");// try unAdded book

        store.buyBook("D456", 1, "arsany@fawry.com", "not used");// try buing Demo
        store.buyBook("P123", 5, "arsany@fawry.com", "Cairo, Egypt");// for quantity more than available
        store.buyBook("E496", 1, "arsany@fawry.com", "not used");
        store.buyBook("NOTFOUND", 1, "arsany@fawry.com", "no address");





    }
}
