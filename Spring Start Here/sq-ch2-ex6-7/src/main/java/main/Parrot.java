package main;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    public String getName() {
        return name;
    };

    public void setName(String name) {
        this.name = name;
    };

    // Allows modification beans added to spring context after they have been added to spring context.
    @PostConstruct
    public void init() {
        this.name = "Koko";
    }


}

