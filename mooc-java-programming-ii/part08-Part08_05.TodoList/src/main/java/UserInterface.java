import java.util.Scanner;

public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.toDoList = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.toDoList.add(task);
            } else if (command.equals("list")) {
                this.toDoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(this.scanner.nextLine());
                this.toDoList.remove(number);
            }
        }
    }
}
