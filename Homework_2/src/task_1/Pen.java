package task_1;

import java.util.Objects;

/**
 * Created by Евгений on 11.03.2016.
 */
public class Pen {
    private int price;
    private String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + " price: " + price + " color: " + color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price &&
                Objects.equals(color, pen.color);
    }

    public static void main(String[] args) {
        Pen pen1 = new Pen(1, "blue");
        Pen pen2 = new Pen(1, "blue");
        System.out.print(pen1.equals(pen2));
    }
}
