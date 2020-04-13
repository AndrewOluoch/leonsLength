package leonsLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    List<Person> personList = new ArrayList<>();

    public void add(Person a){
        personList.add(a);
    }
    public Person findById(Long id){
        for (Person person : personList){
            if (person.getId()==(id)) {
                return person;
            }
        }
        return null;
    }
    public Boolean contains(Person a){
        for(Person person : personList){
            if(person.equals(a))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
    public void remove(Person a){
        if(contains(a))
            personList.remove((int)getIndexOf(a));
    }
    public void remove(Long id){
        Person a = findById(id);
        if (a != null)
            personList.remove((int)getIndexOf(a));
    }
    public Integer getIndexOf(Person a){
        for(int x = 0; x < personList.size(); x++){
            if(personList.get(x).equals(a));
            return x;
        }
        return -1;
    }
    public void removeAll(){
        personList.clear();
    }
    public Integer count(){
        return personList.size();
    }
    public Person[] toArray(){
        Person[] res = (Person[])personList.toArray();
        return res;
    }

    public Iterator iterate() {return personList.iterator();}
}

