import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String name;
    private List<Task> tasks;
    private List<String> technologies;

    public Programmer(String name, List<String> technologies) {
        this.name = name;
        this.technologies = technologies;
        tasks = new ArrayList<>();
    }

    // Метод для добавления задачи
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Метод для получения списка задач
    public List<Task> getTasks() {
        return tasks;
    }

    // Метод для проверки наличия задачи по номеру
    public boolean hasTaskByNumber(int number) {
        for (Task task : tasks) {
            if (task.getNumber() == number) {
                return true; // Если задача с таким номером найдена
            }
        }
        return false; // Если задача с таким номером не найдена
    }

    // Метод для вывода информации о программисте
    @Override
    public String toString() {
        return "Программист: %s, Технологии: %s".formatted(name, technologies);
    }
}
