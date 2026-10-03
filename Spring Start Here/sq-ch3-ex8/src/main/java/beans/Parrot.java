package beans;

public class Parrot {
    public String name;

//    public Parrot() {
//        System.out.println("Parrot Created");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Parrot : " + name;
    }


}
