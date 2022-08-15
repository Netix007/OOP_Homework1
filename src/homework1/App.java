package homework1;

import static homework1.Relation.*;

public class App {

    public static void main(String[] args) {
        Man person1 = new Man("Dmitriy", "Ivanov");
        Woman person2 = new Woman("Olga", "Ivanova");
        Woman person3 = new Woman("Irina", "Ivanova");
        Man person4 = new Man("Maksim", "Ivanov");

        Tree tree = new Tree();
        tree.addLink(person1, person3, PARENT, CHILD);
        tree.addLink(person2, person3, PARENT, CHILD);
        tree.addLink(person3, person4, SISTER, BROTHER);
        tree.addLink(person1, person4, PARENT, CHILD);
        tree.addLink(person2, person4, PARENT, CHILD);

        //person1.printChild(tree);
        person3.printParents(tree);
        person4.printSister(tree);

        //person1.printInfo();
        //person2.printInfo();
        //person3.printInfo();
        //person4.printInfo();
    }
}
