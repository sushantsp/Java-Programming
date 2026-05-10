public abstract class Animal {

    private String animal;

    public Animal(String name) {
        this.animal = name;
    }

    public void eat() {
        System.out.println(this.animal + " eats");
    };
    public void sleep() {
        System.out.println(this.animal + " sleeps");
    };

    public String getName() {
        return this.animal;
    }

    

}
