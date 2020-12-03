package outer;

/**
 * @author supe
 */
public class Outer {
    int m = 0;

    public void test1() {
        System.out.println("外部类的成员方法");
    }

    public void test2() {
        Inner inner = new Inner();
        System.out.println("内部类的成员变量n=" + inner.n);
        inner.show2();
    }

    public class Inner {
        int n = 1;

        public void show1() {
            System.out.println("外部类的成员变量m=" + m);
        }

        void show2() {
            System.out.println("内部类的成员方法");
        }
    }
}

