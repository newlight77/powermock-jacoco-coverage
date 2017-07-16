package example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by muhdk on 15/07/2017.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(PersonManager.class)
public class PersonManagerTest {

    @Test
    public void testblack() throws Exception {
        PersonDao mock = PowerMockito.mock(PersonDao.class);
        List<Person> list = new ArrayList<>();
        list.add(new Person("joh", 22));
        int id = 11;

        PowerMockito.when(mock.findPeople(id)).thenReturn(list);
        PowerMockito.whenNew(PersonDao.class).withAnyArguments().thenReturn(mock);

        PersonDao personDao = new PersonDao();

        PersonManager personManager = new PersonManager();
        List<Person> findppl = personManager.findppl(id);
        Assert.assertTrue(findppl.get(0).getName().equals("joh"));
        Assert.assertTrue(findppl.get(0).getAge()==22);

    }
}
