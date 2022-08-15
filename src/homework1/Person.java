package homework1;

import java.util.List;

public abstract class Person implements Researchable {

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
    public abstract void printInfo();

    public void printChild(Tree tree) {
        printResult(this.name, tree, Relation.PARENT);
    }

    public void printParents(Tree tree) {
        printResult(this.name, tree, Relation.CHILD);
    }

    public void printSister(Tree tree) {
        printResult(this.name, tree, Relation.BROTHER);
    }

    public void printBrother(Tree tree) {
        printResult(this.name, tree, Relation.SISTER);
    }

    private static void printResult(String name, Tree tree, Relation link) {
        List<Link> links = tree.getLinks();
        boolean flag = false;
        for (Link el: links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == link) {
                el.getPersonSecond().printInfo();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No info");
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
