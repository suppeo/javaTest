package utils;

import base.Student;

import java.util.Arrays;

public class ArraysTest {
    public static void test() {
        int[] arr = {5, 7, 2, 9, 3, 6, 8};
        System.out.print("排序前：");
        printArray(arr);
        Arrays.sort(arr);
        System.out.print("排序后：");
        printArray(arr);
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("元素5在数组中的角标为：" + index);
        Arrays.fill(arr, 5);
        System.out.print("替换数组所有元素：");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print((arr[i]) + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void printArray(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print((arr[i]) + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void ObjectTest() {
        Student student1 = new Student("张三", 0, 18, "s001", "计算机科学");
        Student student2 = new Student("李四", 1, 19, "s002", "英语");
        Student student3 = new Student("王五", 1, 20, "s003", "电子");
        Student student4 = new Student("小六", 1, 21, "s004", "机械");
        Student[] students = {student3, student2, student1, student4};
        System.out.print("排序前：");
        printArray(students);
        Arrays.sort(students);
        System.out.print("排序后：");
        printArray(students);
    }
}
