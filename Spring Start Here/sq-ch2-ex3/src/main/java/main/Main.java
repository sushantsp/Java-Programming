package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // define spring context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // add bean to the context
        Parrot p3 = context.getBean("p3",Parrot.class);
        System.out.println(p3.getName());

        // add second bean to the context
        Parrot p2 = context.getBean("p2", Parrot.class);
        System.out.println(p2.getName());

        // add first bean to the context
        Parrot p1 = context.getBean("p1", Parrot.class);
        System.out.println(p1.getName());


        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
