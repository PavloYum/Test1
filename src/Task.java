public class Task {
    private int number; // Номер задачи
    private String title; // Заголовок задачи
    private String description; // Описание задачи

    // Конструктор
    public Task(int number, String title, String description) {
        this.number = number;
        this.title = title;
        this.description = description;
    }

    // Геттеры
    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    // Метод для вывода информации о задаче
    @Override
    public String toString() {
        return "Задача #" + number + ": " + title + " - " + description;
    }
}
