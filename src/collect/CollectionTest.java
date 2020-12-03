package collect;

import base.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

    /**
     * 使用Iterator迭代器遍历时如果调用remove()删除元素会出现异常
     * 可以使用iterator.remove()进行删除操作
     */
    public static void iteratorTest() {
        Student student1 = new Student("张三", 0, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if ("张三".equals(student.getPname())) {
                iterator.remove();
            }
            System.out.println(student.toString());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println(list);
        System.out.println("------------------------------------------------------------------");
    }

    /**
     * foreach不能对数组元素进行修改
     */
    public static void foreachTest() {
        Student student1 = new Student("张三", 0, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        for (Student student : list) {
            System.out.println(student.toString());

        }
        System.out.println("------------------------------------------------------------------");
        list.forEach(student -> System.out.println(student.toString()));
        System.out.println("------------------------------------------------------------------");
    }
}
