package task_6;

import java.util.ArrayList;

/**
 * Created by Евгений on 06.03.2016.<br>
 * Класс блокнота
 */
public class Notebook {
    /**
     * Коллекция с записями (объектами класса Note)
     */
    ArrayList<Note> list = new ArrayList<>();

    /**
     * Создание записи
     * @param text текст записи
     */
    public void createNote(String text) {
        Note note = new Note(text);
        list.add(note);
    }

    /**
     * Обновление записи
     * @param id id записи в списке
     * @param note новый тескт
     */
    public void updateNote(int id, String note) {
        Note item = list.get(id);
        item.updateNote(note);
    }

    /**
     * Удаление записи
     * @param id id удаляемой записи в списке (удаляется запись с id -1)
     */
    public void deleteNote(int id) {
        list.remove(id - 1);
    }

    /**
     *Вывод списка всех записей
     */
    public void showNotes() {
        for (Note note: list) {
            System.out.println(note.getCreatedAt() + "  -  " + note.getNote());
        }
    }

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.createNote("test1");
        notebook.updateNote(0, "test01");
        notebook.createNote("test02");
        notebook.createNote("test03");
        notebook.createNote("test04");
        notebook.createNote("test05");
        notebook.createNote("test06");
        notebook.deleteNote(3);
        notebook.showNotes();
    }
}
