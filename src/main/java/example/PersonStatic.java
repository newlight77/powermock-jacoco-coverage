package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muhdk on 15/07/2017.
 */
public class PersonStatic {

    public static List<Person> find() {
        List<Person> ppl = new ArrayList<>();
        ppl.add(new Person("smith", 20));
        ppl.add(new Person("adam", 33));
        return ppl;
    }

    public static List<Person> findCovered() {
        List<Person> ppl = new ArrayList<>();
        ppl.add(new Person("smith", 20));
        ppl.add(new Person("adam", 33));
        return ppl;
    }
}
