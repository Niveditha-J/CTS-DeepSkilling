package TaskManagement;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Develop Backend", "In Progress"));
        manager.addTask(new Task(3, "Testing", "Pending"));

        manager.traverseTasks();

        System.out.println("\nSearching for task ID 2:");
        Task t = manager.searchTask(2);
        if (t != null) t.display();
        else System.out.println("Task not found.");

        System.out.println("\nDeleting task ID 1:");
        manager.deleteTask(1);

        System.out.println("\nTask List after deletion:");
        manager.traverseTasks();
    }
}
