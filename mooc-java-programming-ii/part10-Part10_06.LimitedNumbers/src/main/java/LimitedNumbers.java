
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Write a program that reads user input. When the user gives a negative number as an input,
//  the input reading will be stopped. After this,
//  print all the numbers the user has given as input that are between 1 and 5.
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                break;
            }

            numbers.add(number);
        }

        numbers.stream()
            .filter(value -> value >= 1 && value <=5)
            .forEach(value -> System.out.println(value));
    }
}
