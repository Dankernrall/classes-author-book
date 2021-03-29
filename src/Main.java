public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр Пушкин", "AlehandroPushka@gmail.com", 'm');
        Book book = new Book("Legendary Book", author, 35, 2);
        System.out.println(book.toString());
    }
}
