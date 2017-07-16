package example;

import java.util.List;

/**
 * Created by muhdk on 15/07/2017.
 */
public class PersonManager {

    public List<Person> findppl(int id) {
        PersonDao personDao = new PersonDao();
        return personDao.findPeople(id);

    }
}
