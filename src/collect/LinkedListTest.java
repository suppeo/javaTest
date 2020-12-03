package collect;

import base.Student;

import java.util.LinkedList;

/**
 * linkedList结点之间通过引用相连接，提高了增删元素的效率，双向循环链表
 *
 * @author supe
 */
public class LinkedListTest {
    public static void test() {
        Student student1 = new Student("张三", 0, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        LinkedList<Student> link = new LinkedList<>();
        link.add(student1);
        link.add(student2);
        System.out.println(link);
        //向尾部追加元素
        link.offer(student3);
        //向头部追加元素
        link.push(student4);
        System.out.println(link);
        //获取第一个元素
        Student student = link.peek();
        System.out.println(student);
        link.removeFirst();
        link.pollLast();
        System.out.println(link);

    }
}
