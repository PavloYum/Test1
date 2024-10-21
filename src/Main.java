import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> technologies = Arrays.asList("Java", "Git", "JavaScript");

        // Создаем программиста
        Programmer programmer = new Programmer("Pavlo Boiko", technologies);

        // Создаем несколько задач
        Task task1 = new Task(1, "Реализовать вход", "");
        Task task2 = new Task(2, "Исправить ошибки", "");
        Task task3 = new Task(3, "Написать документацию", "");

        // Добавляем задачи программисту
        programmer.addTask(task1);
        programmer.addTask(task2);
        programmer.addTask(task3);

        // Выводим информацию о программисте
        System.out.println(programmer);

        // Выводим список всех задач
        System.out.println("Задача:");
        for (Task task : programmer.getTasks()) {
            System.out.println(task);
        }

        // Проверяем, есть ли задача с номером 2
        int taskNumberToCheck = 2;
        if (programmer.hasTaskByNumber(taskNumberToCheck)) {
            System.out.printf("Задача с номером %d существует.%n", taskNumberToCheck);
        } else {
            System.out.printf("Задача с номером %d не существует.%n", taskNumberToCheck);
        }
    }
}
