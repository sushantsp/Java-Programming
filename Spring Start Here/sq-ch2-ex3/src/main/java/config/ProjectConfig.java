package config;


import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "p1")
    @Primary
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }


    @Bean(name = "p2")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Poko");
        return p;
    }

    @Bean("p3")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Toko");
        return p;
    }
}
