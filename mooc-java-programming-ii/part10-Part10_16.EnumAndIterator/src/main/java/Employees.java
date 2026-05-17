import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        while (iterator.hasNext()) {
            this.persons.add(iterator.next());
        }
    }
// public void print() prints all employees

    public void print() {
        Iterator<Person> iterator = this.persons.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.persons.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }



// Make a class Employees. Employees -object contains a list of Person -objects. 
// The class has a constructor which takes no parameters, and the following methods:

// public void print() prints all employees
// public void print(Education education) prints the employees whose education matches the education given as a parameter.
// NB: The print method of the Employees class must be implemented using an iterator!


// Make a method public void fire(Education education) for the Employees class. 
// The method removes all employees whose education matches the education given as parameter from the employees list.

    public void fire(Education education) {
        Iterator<Person> iterator = this.persons.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
