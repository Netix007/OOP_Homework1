package homework1;

public class Man extends Person{

    public Man(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.printf("name: %s, surname: %s, gender: man%n", getName(), getSurname());
    }

}
