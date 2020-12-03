package outer;

/**
 * @author supe
 */
public class Outer01 {
    int m = 0;

    void test1() {
        System.out.println("外部类的成员方法");
    }

    public void test2() {
        class Inner {
            int n = 1;

            void show() {
                System.out.println("外部类的成员变量m=" + m);
                test1();
            }
        }
        Inner inner = new Inner();
        System.out.println("局部内部类的成员变量n=" + inner.n);
        inner.show();
    }
}
