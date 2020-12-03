package collect;

import base.Student;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet内部采用平衡二叉排序树存储元素，对对象使用时需实现Comparable中的compareTo()方法或自定义比较器
 */

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        return student1.getPname().compareTo(student2.getPname());
    }
}

public class TreeSetTest {
    public static void test01() {
        Student student1 = new Student("张三", 0, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student1);
        treeSet.add(student4);
        System.out.println(treeSet);
        System.out.println("--------------------------------------------------------------------");
        System.out.println(treeSet.higher(student3));
        System.out.println("--------------------------------------------------------------------");
    }

    public static void test02() {
        Student student1 = new Student("张三", 0, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        TreeSet<Student> treeSet = new TreeSet<Student>(new MyComparator());
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student1);
        treeSet.add(student4);
        System.out.println(treeSet);
    }
}
