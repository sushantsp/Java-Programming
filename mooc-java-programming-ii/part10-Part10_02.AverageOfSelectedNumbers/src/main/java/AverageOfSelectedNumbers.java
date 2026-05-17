
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String decision = scanner.nextLine();

        if (decision.equals("n")) {
            double averageOfNegativeNumbers = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

            System.out.println("Average of the negative numbers: " + averageOfNegativeNumbers);
        } else {
            double averageOfPositiveNumbers = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number >= 0)
                .average()
                .getAsDouble();

            System.out.println("Average of the postive numbers: " + averageOfPositiveNumbers);
        }
        
        


    }
}
