package maptest;

import base.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * hashMap 是“数组+ 链表”的组合，初始容量大小为16，加载因子为0.75，添加超过12个元素将容量扩大为32
 * LinkedHashMap 可以保证集合元素存入与取出的顺序一致
 */
public class HashMapTest {
    public static void test() {
        Map map = new HashMap();
        map.put("1", "Jack");
        map.put("2", "Rose");
        map.put("3", "Lucy");
        map.put("4", "Lucy");
        map.put("1", "Tom");
        System.out.println(map);
        System.out.println(map.containsKey("1"));
        System.out.println(map.get("1"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.replace("1", "Tom2");
        System.out.println(map);
        map.remove("1");
        System.out.println(map);
    }

    public static void iteratorTest() {
        Map map = new HashMap();
        map.put("1", "Jack");
        map.put("2", "Rose");
        map.put("3", "Lucy");
        System.out.println(map);
        System.out.println("通过KeySet()遍历-----------------");
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("通过entrySet()遍历-----------------");
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry) (iterator1.next());
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }

    public static void forEachTest() {
        Map map = new HashMap();
        map.put("1", "Jack");
        map.put("2", "Rose");
        map.put("3", "Lucy");
        System.out.println(map);
        System.out.println("通过forEach遍历-----------------");
        map.forEach((key, value) -> System.out.println(key + ":" + value));

        Student student1 = new Student("张三", 0, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        HashMap<String, Student> map1 = new HashMap<>();
        map1.put("1", student1);
        map1.put("2", student2);
        map1.put("3", student3);
        map1.put("4", student4);
        System.out.println(map1);
        map1.forEach((key, student) -> System.out.println(key + ":" + student));
    }
}
