package homework1;

public class Woman extends Person {

    public Woman(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void printInfo() {
        System.out.printf("name: %s, surname: %s, gender: woman, age: %d%n", getName(), getSurname(), getAge());
    }

}
