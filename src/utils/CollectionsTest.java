package utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void test() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "D", "W", "B", "K");
        System.out.println("排序前：" + list);
        Collections.reverse(list);
        System.out.println("反转后：" + list);
        Collections.sort(list);
        System.out.println("按自然顺序排列：" + list);
        Collections.shuffle(list);
        System.out.println("随机打乱顺序：" + list);
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("首尾交换：" + list);
        System.out.println("集合中最大元素：" + Collections.max(list));
        System.out.println("集合中最小的元素：" + Collections.min(list));
        Collections.replaceAll(list, "W", "A");
        System.out.println("替换后的集合：" + list);
        Collections.addAll(list, "F", "G", "U", "R");
        Collections.sort(list);
        System.out.println("按自然顺序排列：" + list);
        int index = Collections.binarySearch(list, "G");
        System.out.println("通过二分查找元素G所在角标为：" + index);
    }

}
