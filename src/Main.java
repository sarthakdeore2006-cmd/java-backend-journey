import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Previous Task testing
        Task task = new Task("Buy Groceries", "Milk");

        System.out.println(task);

        task.markComplete();

        System.out.println(task);

        // TaskManager
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Study Java", "Learn ArrayList");
        Task task2 = new Task("Programming", "Solve 2 problems");

        manager.addTask(task1);
        manager.addTask(task2);

        manager.viewTasks();

        manager.completeTask(0);

        manager.deleteTask(1);

        manager.viewTasks();


        // Menu
        System.out.println("========== TASK MANAGER ==========");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Complete Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.println("==================================");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Add Task selected");
                break;

            case 2:
                manager.viewTasks();
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}