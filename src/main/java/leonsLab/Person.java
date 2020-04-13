package leonsLab;

public class Person
{
    private final Long id;
    private String name;
    private final boolean wasSetUponConstruction;

    public Person(){
        id = 0L;
        wasSetUponConstruction = false;
    }

    public Person(Long id,String name) {
        this.id = id;
        this.name = name;
        wasSetUponConstruction = true;
    }

    public boolean getWasSetUponConstruction() {
        return wasSetUponConstruction;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
