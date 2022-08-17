package homework1;

public class Man extends Person{

    public Man(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void printInfo() {
        System.out.printf("name: %s, surname: %s, gender: man, age: %d%n", getName(), getSurname(), getAge());
    }

}
