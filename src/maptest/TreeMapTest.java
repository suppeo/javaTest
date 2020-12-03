package maptest;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}

public class TreeMapTest {
    public static void test() {
        TreeMap map = new TreeMap(new MyComparator());
        map.put("1", "Rose");
        map.put("2", "Jack");
        map.put("3", "Lucy");
        System.out.println(map);
    }
}
