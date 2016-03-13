package Homework_1.src.task_6.task_6;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Евгений on 06.03.2016.<br>
 * Класс записи блокнота
 */
public class Note {
    private String note;
    private String createdAt;
    private String updatedAt;
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd.MM.yy");

    /**
     * Конструктор, записывает время созданной записи в поле createdAt
     * @param note сама запись
     */
    public Note(String note) {
        this.note = note;
        this.createdAt = dateFormat.format(new Date());
    }

    /**
     *  Обновление записи
     * @param note новый тескт
     */
    public void updateNote(String note) {
        this.note = note;
        this.updatedAt = dateFormat.format(new Date());
    }

    public String getNote() {
        return note;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
