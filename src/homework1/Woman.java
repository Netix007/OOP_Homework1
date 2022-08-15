package homework1;

public class Woman extends Person {

    public Woman(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.printf("name: %s, surname: %s, gender: woman%n", getName(), getSurname());
    }

}
