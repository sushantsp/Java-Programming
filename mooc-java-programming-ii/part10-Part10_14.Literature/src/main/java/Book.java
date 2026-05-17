public class Book {

    private String name;
    private int age;

    public Book(String bookName, int recommendedAge) {
        this.name = bookName;
        this.age = recommendedAge;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }
}
