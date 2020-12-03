package outer;

public class Outer02 {
    static int m = 0;

    public static class Inner {
        public void show() {
            System.out.println("外部类的成员变量m=" + m);
        }
    }
}
