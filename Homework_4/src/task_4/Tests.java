package task_4;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

/**
 * Created by Евгений on 09.05.2016.
 */
public class Tests {
    @BeforeClass
    public void init() {
        Map<String, Set> films = new HashMap<>();
        HashSet<String> actors = new HashSet<>();
        actors.add("Вячеслав Тихонов");
        actors.add("Борис Броневой");
        actors.add("Леонид Куравлёв");
        films.put("Семьнадцать мгновений весны", actors);
        HashSet<String> anotherMoreActors = new HashSet<>();
        anotherMoreActors.add("Евгений Леонов");
        anotherMoreActors.add("Папанов");
        anotherMoreActors.add("Ургант");
        films.put("Белорусский вокзал", anotherMoreActors);
    }

    @Test
    public void serializeCollection() {

    }
}
