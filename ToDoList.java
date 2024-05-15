import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<String>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void printTasks() {
        System.out.println("Your To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.addTask("Buy groceries");
        list.addTask("Walk the dog");
        list.addTask("Finish homework");
        list.printTasks();
        list.completeTask(1);
        list.printTasks();
    }
}