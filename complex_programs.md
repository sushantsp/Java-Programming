# Complex Programs

When you learn programming, you also develop a better eye for reading code (yours and others). In this part, we understood the use of lists and practiced separating the UI from the program logic.

---

## On the Role of Scientific Thought  
*By Edsger W. Dijkstra*

> Let me try to explain to you, what to my taste is characteristic for all intelligent thinking. It is, that one is willing to study in depth an aspect of one's subject matter in isolation for the sake of its own consistency, all the time knowing that one is occupying oneself only with one of the aspects. We know that a program must be correct and we can study it from that viewpoint only; we also know that it should be efficient and we can study its efficiency on another day, so to speak. In another mood we may ask ourselves whether, and if so: why, the program is desirable. But nothing is gained - on the contrary! - by tackling these various aspects simultaneously. It is what I sometimes have called "the separation of concerns", which, even if not perfectly possible, is yet the only available technique for effective ordering of one's thoughts, that I know of. This is what I mean by "focusing one's attention upon some aspect": it does not mean ignoring the other aspects, it is just doing justice to the fact that from this aspect's point of view, the other is irrelevant. It is being one- and multiple-track minded simultaneously.

---

## The Core of Dijkstra's Message

The problem areas of a program must be separated from each other. This is exactly what we have been doing with object-oriented programming and by separating the UI from the program logic. Each problem area has been separated into its own part.  

This concept can also be viewed through the lens of program responsibilities. Robert "Uncle Bob" C. Martin describes this in his blog as the **Single Responsibility Principle**:

> When you write a software module, you want to make sure that when changes are requested, those changes can only originate from a single person, or rather, a single tightly coupled group of people representing a single narrowly defined business function. You want to isolate your modules from the complexities of the organization as a whole, and design your systems such that each module is responsible (responds to) the needs of just that one business function.  

> [..in other words..] Gather together the things that change for the same reasons. Separate those things that change for different reasons.

---

## Clean Code and Program Structure

Proper program structure and following good naming principles lead to clean code. As you code more, you'll learn that each program part can be given one clear area of responsibility.



# Breaking Down the Concept of Separation of Concerns and Single Responsibility Principle

To better understand the ideas of **Separation of Concerns** and the **Single Responsibility Principle**, let’s break them down step by step with examples and explanations.

---

## 1. **Separation of Concerns (SoC)**

### What is it?  
Separation of Concerns is a design principle for dividing a program into distinct sections, where each section addresses a separate concern. A "concern" refers to a specific aspect or functionality of the program.

### Why is it important?  
- It makes the program easier to understand, maintain, and extend.
- Changes in one part of the program are less likely to affect other parts.
- It promotes modularity and reusability.

### Example:  
Imagine you are building a **To-Do List Application**. The program has the following concerns:  
1. **User Interface (UI)**: Handles how the user interacts with the application.  
2. **Business Logic**: Manages the rules of the application (e.g., adding, removing, or updating tasks).  
3. **Data Storage**: Handles saving and retrieving tasks from a database or file.

#### Without Separation of Concerns:
```java
public class TodoApp {
    public static void main(String[] args) {
        // UI, logic, and data storage all mixed together
        System.out.println("Enter a task:");
        String task = new Scanner(System.in).nextLine();
        List<String> tasks = new ArrayList<>();
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
}
```

### With Separation of Concerns:
```java
// UI Layer
public class TodoUI {
    public void displayTask(String task) {
        System.out.println("Task added: " + task);
    }
}

// Business Logic Layer
public class TodoLogic {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}

// Data Storage Layer
public class TodoStorage {
    public void saveTasks(List<String> tasks) {
        // Code to save tasks to a file or database
    }
}
```

// UI Layer
public class TodoUI {
    public void displayTask(String task) {
        System.out.println("Task added: " + task);
    }
}

Here, each class has a **single concern**:

- `TodoUI` handles user interaction.
- `TodoLogic` manages the business rules.
- `TodoStorag`e` deals with saving data.

### 2. Single Responsibility Principle (SRP)

What is it?
The Single Responsibility Principle states that a class or module should have **only one reason to change**. In other words, it should have **one responsibility**.

Why is it important?
- It reduces the complexity of the code.
- It makes the code easier to test and debug.
- It ensures that changes in one part of the program don’t unintentionally affect other parts.
Example:
Let’s extend the **To-Do List Application** example.

**Without SRP:**
```java
public class TodoApp {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
        // Code to save tasks to a file
    }
}
```

Here, the TodoApp class is doing too much:

1. Managing the list of tasks.
2. Displaying messages to the user.
3. Saving tasks to a file.

**With SRP**:
```java
// Handles task management
public class TaskManager {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}

// Handles user interaction
public class TaskUI {
    public void displayTask(String task) {
        System.out.println("Task added: " + task);
    }
}

// Handles saving tasks
public class TaskStorage {
    public void saveTasks(List<String> tasks) {
        // Code to save tasks to a file
    }
}

```

Now, each class has one responsibility:

 - `TaskManager` manages the list of tasks.
 - `TaskUI handles` user interaction.
 - `TaskStorage` saves tasks to a file.

### 3. Combining SoC and SRP

Key Idea:
Separation of Concerns and the Single Responsibility Principle work together to create clean, modular, and maintainable code. By separating concerns, you ensure that each part of the program focuses on a specific functionality. By following SRP, you ensure that each class or module has a single responsibility.

Example:
Let’s combine the principles in a Banking Application.

**Without SoC and SRP**:

```java
public class BankApp {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        // Code to save transaction to a database
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            // Code to save transaction to a database
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
```

**With SoC and SRP**:

```java
// Handles account operations
public class Account {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Handles user interaction
public class AccountUI {
    public void displayBalance(double balance) {
        System.out.println("Current balance: " + balance);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

// Handles saving transactions
public class TransactionStorage {
    public void saveTransaction(String type, double amount) {
        // Code to save transaction to a database
    }
}
```


Here:

- `Account` handles account operations (e.g., deposit, withdraw).
- `AccountUI` handles user interaction.
- `TransactionStorage` handles saving transactions.

### 4. Key Takeaways
1. Separation of Concerns: Divide your program into distinct sections, each responsible for a specific functionality.

2. Single Responsibility Principle: Ensure that each class or module has only one reason to change.
3. Benefits:

* Easier to understand and maintain.
* Reduces the risk of introducing bugs when making changes.
* Promotes reusability and modularity.

By following these principles, you can write clean, maintainable, and scalable code.