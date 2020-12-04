package streamtest;

import base.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void test() {
        Student student1 = new Student("张三", 1, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        Student student5 = new Student("张小明", 1, 18, "s005", "电子");
        Student student6 = new Student("张燕", 0, 19, "s006", "自动化");
        Student student7 = new Student("张慧慧", 0, 19, "s007", "物理");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student5);
        list.add(student2);
        list.add(student1);
        list.add(student7);
        list.add(student4);
        list.add(student3);
        list.add(student6);
        Stream<Student> studentStream = list.stream();
        Stream<Student> studentStream1 = studentStream.filter(i -> i.getPname().startsWith("张"));
        Stream<Student> studentStream2 = studentStream1.limit(2);
        studentStream2.forEach(System.out::print);
        System.out.println("----------------------------------------------------------------");
        list.stream().filter(student -> student.getPname().startsWith("张"))
                .limit(2)
                .forEach(System.out::print);
        System.out.println("----------------------------------------------------------------");
        list.stream().filter(student -> student.getPname().startsWith("张"))
                .peek(student -> student.setsId(student.getsId().toUpperCase()))
                .sorted()
                .skip(1)
                .limit(2)
                .forEach(System.out::print);
        System.out.println("----------------------------------------------------------------");
        List<Student> studentList = list.stream().filter(student -> student.getPname().startsWith("张"))
                .peek(student -> student.setsId(student.getsId().toUpperCase()))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(studentList);
        System.out.println("----------------------------------------------------------------");
        String s = list.stream().filter(student -> student.getPname().startsWith("张"))
                .peek(student -> student.setsId(student.getsId().toUpperCase()))
                .sorted()
                .map(Student::toString)
                .collect(Collectors.joining("and"));
        System.out.println(s);
    }
}
