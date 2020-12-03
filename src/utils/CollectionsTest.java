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
    }
}
