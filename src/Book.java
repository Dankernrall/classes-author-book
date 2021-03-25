import java.util.Random;

public class Book {
    private String name = "Legendary Book",author;
    private double price;
    private int qty;
    final Random random = new Random();

    void ToString(){
        Author authorSecondClass = new Author("Александр Пушкин","AlehandroPushka@gmail.com", 'm');
        name = getName();
        author = authorSecondClass.getName();
        setPrice((double)random.nextInt(100));
        setQty(random.nextInt(10));
        System.out.println("\"" + getName() + "\" от " + authorSecondClass.ToString() + "  \n\\\\Дополнительно сделал:"
                + "\nСтоимостью: " + getPrice() + " $\nВ количестве: " + getQty() + " штук.");
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

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }




}

