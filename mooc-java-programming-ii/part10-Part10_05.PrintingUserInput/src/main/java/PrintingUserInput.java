
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Write a program that reads the user's input as strings. When the user inputs an empty string (only presses enter), 
// the input reading will be stopped and the program will print all the user inputs.

        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            inputs.add(input);
        }

        inputs.stream().forEach(input -> System.out.println(input));
    }
}
