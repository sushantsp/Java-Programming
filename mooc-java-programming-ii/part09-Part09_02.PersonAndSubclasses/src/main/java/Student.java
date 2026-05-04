public class Student extends Person{

    private Integer credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study() {
        this.credits += 1;
    }

    public int credits() {
        return this.credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
    }
    

}
