package homework5;

public class Person {
    private final long id;
    private String personName;

    public Person(long id, String personName) {
        this.id = id;
        this.personName = personName;
    }

    public long getId() {
        return id;
    }

    public String getpersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                '}';
    }
}
