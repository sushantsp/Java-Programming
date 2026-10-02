package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p1 = new Parrot();
        p1.setName("Kiki");

        Parrot p2 = new Parrot();
        p2.setName("Miki");

        Supplier<Parrot> parrotSupplier = () -> p1;
        Supplier<Parrot> parrotSupplier2 = () -> p2;

        // add first bean
        context.registerBean("parrot1", Parrot.class, parrotSupplier, x -> x.setPrimary(true));
        // add second bean
        context.registerBean("parrot2", Parrot.class, parrotSupplier2);

        Parrot pr = context.getBean("parrot2", Parrot.class);
        System.out.println(pr.getName());
    }
}
