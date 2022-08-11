package homework1;
public class Person {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
