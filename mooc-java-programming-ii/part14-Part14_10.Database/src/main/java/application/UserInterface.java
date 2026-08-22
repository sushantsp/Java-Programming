package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            if (command.equals(String.valueOf(1))) {
                System.out.println("Listing the database contents:");
                System.out.println(database.list());
            }

            if (command.equals(String.valueOf(2))) {
                System.out.println("Name: ");
                String name = this.scanner.nextLine();
                System.out.println("Description: ");
                String description = this.scanner.nextLine();
                this.database.add(new Todo(name, description, false));
            }

            if (command.equals(String.valueOf(3))) {
                System.out.println("Which todo should be marked as done (give the id)?");
                int idtoMarkAsDone = Integer.parseInt(this.scanner.nextLine());
                this.database.markAsDone(idtoMarkAsDone);
            }
        
            if (command.equals(String.valueOf(4))) {
                System.out.println("Which todo should be removed (give the id)? ");
                int idToRemove = Integer.parseInt(this.scanner.nextLine());
                this.database.remove(idToRemove);
            }
        }

        System.out.println("Thank you!");
    }

}
