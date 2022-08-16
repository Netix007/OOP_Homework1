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

        //(new Research()).printChild(person2.getName(), tree);
        (new Research()).printParents(person3.getName(), tree);
        (new Research()).printSister(person4.getName(), tree);

        //person1.printInfo();
        //person2.printInfo();
        //person3.printInfo();
        //person4.printInfo();
    }
}
