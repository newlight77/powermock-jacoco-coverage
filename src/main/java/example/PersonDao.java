package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muhdk on 15/07/2017.
 */
public class PersonDao {

    public List<Person> find(final int id) {
        List<Person> ppl = new ArrayList<>();
        ppl.add(new Person("smith", 20));
        ppl.add(new Person("adam", 33));
        return ppl;
    }
}
