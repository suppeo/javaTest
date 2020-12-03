package exception;

public class DivideExceTest {
    public static int divide(int x, int y) throws DivideByMinusException {
        if (y == 0) {
            throw new DivideByMinusException("除数是0！");
        }
        return x / y;
    }

    public static void test() {
        try {
            int result = divide(4, 0);
            System.out.println(result);
        } catch (DivideByMinusException e) {
            System.out.println("捕获的异常为：" + e.getMessage());
        }
    }
}
