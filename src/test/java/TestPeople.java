import leonsLab.People;
import leonsLab.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People();
        people.add(new Person(2567L, "Andrew"));
        people.add(new Person(5558L, "Day"));
        people.add(new Person(9098L, "Ed"));
        Assert.assertEquals(Integer.valueOf(3),people.count());
    }
    @Test
    public void testRemove(){
        ArrayList<Person> y = new ArrayList<>();
        y.add(new Person(2567L, "Andrew"));
        y.add(new Person(5558L, "Day"));
        y.add(new Person(9098L, "Ed"));
    }





}