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

    public void completeTask(int index) {
        tasks.get(index).markComplete();
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }
}