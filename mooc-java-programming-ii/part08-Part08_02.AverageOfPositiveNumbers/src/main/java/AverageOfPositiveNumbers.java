
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else if (number > 0 ) {
                sum += number;
                count += 1;
            }

        }
        
        if (count == 0) {
            System.out.println("Cannnot calculate the average");
        } else {
            System.out.println(sum/count);
        }



    }
}
