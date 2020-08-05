package example;

import java.util.List;

/**
 * Created by muhdk on 15/07/2017.
 */
public class PersonManager {

    public List<Person> find(int id) {
        PersonDao personDao = new PersonDao();
        return personDao.find(id);

    }

    public List<Person> findStatic() {
        return PersonStatic.find();
    }

    public List<Person> findStaticCovered() {
        return PersonStatic.findCovered();
    }
}
