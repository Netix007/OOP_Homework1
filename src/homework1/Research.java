package homework1;

import java.util.List;

public class Research {

    public static void printChild(String name, Tree tree) {
        printResult(name, tree, Relation.PARENT);
    }

    public static void printParents(String name, Tree tree) {
        printResult(name, tree, Relation.CHILD);
    }

    public static void printSister(String name, Tree tree) {
        printResult(name, tree, Relation.BROTHER);
    }

    public static void printBrother(String name, Tree tree) {
        printResult(name, tree, Relation.SISTER);
    }

    private static void printResult(String name, Tree tree, Relation link) {
        List<Link> links = tree.getLinks();
        boolean flag = false;
        for (Link el: links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == link) {
                System.out.println(el.getPersonSecond());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No info");
        }
    }

}
