package homework1;

import static homework1.Relation.*;

public class App {

    public static void main(String[] args) {
        Person person1 = new Person("Dmitriy", "Ivanov");
        Person person2 = new Person("Olga", "Ivanova");
        Person person3 = new Person("Irina", "Ivanova");
        Person person4 = new Person("Maksim", "Ivanov");

        Tree tree = new Tree();
        tree.addLink(person1, person3, PARENT, CHILD);
        tree.addLink(person2, person3, PARENT, CHILD);
        tree.addLink(person3, person4, SISTER, BROTHER);
        tree.addLink(person1, person4, PARENT, CHILD);
        tree.addLink(person2, person4, PARENT, CHILD);

        //Research.printChild("Olga", tree);
        //Research.printParents("Dmitriy", tree);
        Research.printBrother("Irina", tree);

    }
}
