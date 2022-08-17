package homework1;

import java.util.Comparator;

public class sortTree implements Comparator<Link> {
    @Override
    public int compare(Link o1, Link o2) {
        return o1.getPersonSecond().getAge() - o2.getPersonSecond().getAge();
    }
}
