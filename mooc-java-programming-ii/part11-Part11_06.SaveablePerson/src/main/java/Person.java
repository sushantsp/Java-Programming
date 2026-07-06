public class Person implements Saveable {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.address = address;
        this.name = name;
    }

    public void save() {return;}

    public void delete() {
        return;
    }

    public void load(String address) {
        return;
    }
}
