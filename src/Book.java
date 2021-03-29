public class Book {
    private final String name;
    private final Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, int price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }


    @Override
    public String toString() {
        return "\'" + getName() + "\'" +
                " от " + author.toString();
    }
}

