package collect;

import base.Student;

import java.util.ArrayList;

/**
 * ArrayList随机存取，查询效率较高
 */
public class ArrayListTest {
    public static void test() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("stu1");
        list.add("stu2");
        list.add("stu3");
        System.out.println("集合的长度：" + list.size());
        System.out.println("第二个元素是：" + list.get(1));
        ArrayList<Student> list1 = new ArrayList<>();
        Student student = new Student("张三", 0, 18, "s001", "计算机科学");
        list1.add(student);
        student = new Student("李四", 1, 19, "s002", "英语");
        list1.add(student);
        System.out.println("集合的长度：" + list1.size());
        System.out.println("第二个元素是：" + list1.get(1).getPname());
    }
}
