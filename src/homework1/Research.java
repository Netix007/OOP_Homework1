package homework1;

import java.util.ArrayList;
import java.util.List;

public class Research implements Researchable{

    @Override
    public void printChild(String name, Tree tree) {
        printResult(name, tree, Relation.PARENT);
    }
    @Override
    public void printParents(String name, Tree tree) {
        printResult(name, tree, Relation.CHILD);
    }
    @Override
    public void printSister(String name, Tree tree) {
        printResult(name, tree, Relation.BROTHER);
    }
    @Override
    public void printBrother(String name, Tree tree) {
        printResult(name, tree, Relation.SISTER);
    }

    private static void printResult(String name, Tree tree, Relation link) {
        List<Link> links = tree.getLinks();
        Tree result = new Tree();
        boolean flag = false;
        for (Link el: links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == link) {
                result.getLinks().add(el);
                //System.out.println(el.getPersonSecond());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No info");
        } else {
            //result.getLinks().sort(new sortTree());
            result.getLinks().sort(((o1, o2) -> o1.getPersonSecond().getName().compareTo(o2.getPersonSecond().getName())));
            for (Link el: result.getLinks()
                 ) {
                System.out.println(el.getPersonSecond());
            }
        }
    }

}