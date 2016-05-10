package task_3;

import java.util.Objects;

/**
 * Created by Евгений on 29.03.2016.
 */
public abstract class Stationery {
    double price;
    private String name = this.getClass().getSimpleName().toLowerCase();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationery that = (Stationery) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
