public class Book implements Packable{

    // author (String), name of the book (String), and the weight of the book (double) as parameters.
    private String author;
    private String bookName;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.bookName = name;
        this.weight = weight;
    }

    public String toString() {
        // Fyodor Dostoevsky: Crime and Punishment
        return this.author + ": " + this.bookName;
    }

    public double weight() {
        return this.weight;
    }


}
