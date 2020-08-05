package example;

import org.junit.Test;

import java.util.List;

/**
 * Created by muhdk on 16/07/2017.
 */
public class PersonManagerIntegrationTest {

    @Test
    public void test(){
        PersonManager personManager = new PersonManager();
        List<Person> findppl = personManager.find(22);
        System.out.println(findppl);

    }
}
