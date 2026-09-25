import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public boolean completeTask(int index) {

        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
            return true;
        } else {
            System.out.println("Invalid task index!");
            return false;
        }
    }

    public boolean deleteTask(int index) {

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            return true;
        } else {
            System.out.println("Invalid task index!");
            return false;
        }
    }
}