
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.split(","))
                .sorted((p1, p2) -> 
                    Double.compare(
                        Double.valueOf(p1[5]), 
                        Double.valueOf(p2[5])
                )).forEach(p -> System.out.println(p[3] + " (" + p[4] + "), " + p[2].split(" ")[1] + ", " + p[5]));
    
// Adult literacy rate, population 15+ years, female (%),United Republic of Tanzania,2015,76.08978
// Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513
// Adult literacy rate, population 15+ years, male (%),Honduras,2014,87.39595

// Niger (2015), female, 11.01572
// Mali (2015), female, 22.19578
// Guinea (2015), female, 22.87104
// Afghanistan (2015), female, 23.87385
// Central African Republic (2015), female, 24.35549

// Niger (2015), female, 11.01572
// Mali (2015), female, 22.19578
// Guinea (2015), female, 22.87104
// Afghanistan (2015), female, 23.87385
// Central African Republic (2015), female, 24.35549
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
