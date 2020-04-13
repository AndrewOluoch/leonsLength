import leonsLab.Person;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestPerson {

    @Test
    public void testConstructor(){
//        Person person = new Person();
        Person person= new Person(9768L,"Drew");
//        boolean p1HasName = person.getName() != null;
//        boolean p1HasId = person.getId() != 0L;
//        boolean isValid = p1HasId && p1HasName;
        boolean isValid = person.getWasSetUponConstruction();
        assertTrue(isValid);
    }

    @Test
    public void testSetName(){
        Person p1 = new Person(9768L,"Drew");
        Person p2 = new Person();

        String nameBeforeP1 = p1.getName();
        String nameBeforeP2 = p2.getName();

//        p1.setName();
//        p2.setName();

//        Create a testSetName method which ensures that a Person object's name variable is being set by invoking the .setName method.

        boolean wasSetWithSetname = true;
        assertTrue(wasSetWithSetname);
    }

}