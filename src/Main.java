import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // TaskManager
        TaskManager manager = new TaskManager();
        boolean running = true;
        while (running) {





        // Menu
        System.out.println("========== TASK MANAGER ==========");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Complete Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.println("==================================");
        System.out.print("Choose an option: ");

            int choice;

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {

            case 1:
                System.out.println("Enter task title:");
                String title = scanner.nextLine();
                System.out.println("Enter task description:");
                String description = scanner.nextLine();

                Task task = new Task(title, description);
                manager.addTask(task);

                System.out.println("Task added successfully!");
                break;

            case 2:
                manager.viewTasks();
                break;
            case 3:
                System.out.print("Enter task index:");
                int index = scanner.nextInt();
                boolean success = manager.completeTask(index);

                if (success) {
                    System.out.println("Task completed successfully!");
                }
                break;
                case 4:
                    System.out.print("Enter task index: ");
                    int deleteIndex = scanner.nextInt();

                    boolean deleted = manager.deleteTask(deleteIndex);

                    if (deleted) {
                        System.out.println("Task deleted successfully!");
                    }
                    break;

            default:
                System.out.println("Invalid option");
        }
        }
    }
}