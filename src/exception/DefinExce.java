package exception;

public class DefinExce {
    public static void printAge(int age) throws Exception {
        if (age <= 0) {
            throw new Exception("输入的年龄有误，必须是正整数！");
        } else {
            System.out.println("此人的年龄为：" + age);
        }
    }

    public static void test() {
        int age = -1;
        try {
            printAge(age);
        } catch (Exception e) {
            System.out.println("捕获的异常为：" + e.getMessage());
        }
    }
}
