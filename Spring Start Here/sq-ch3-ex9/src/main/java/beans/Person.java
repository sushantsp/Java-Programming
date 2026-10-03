package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    public String name = "Ella";
    public Parrot parrot;

    // direct injetion of bean based on the name
//    public Person(Parrot parrot2) {
//        this.parrot = parrot2;
//    }

    // injection of the bean using @Qualifier - more intentional. avoid refactoring bugs
    public Person(@Qualifier("parrot2") Parrot parrot){
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Person : " + name;
    }
}
