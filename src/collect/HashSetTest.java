package collect;

import base.Student;

import java.util.HashSet;

/**
 * HashSet存储无序元素，并保证元素不会重复，对对象使用时需要重写hashCode()和equals()方法
 */
public class HashSetTest {
    public static void test() {
        Student student1 = new Student("张三", 0, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        HashSet<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student1);
        set.forEach(student -> System.out.println(student.toString()));
    }
}
