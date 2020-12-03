package outer;

public class OuterTest {

    public static void outerTest() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show1();
        outer.test2();
    }

    public static void outer01Test() {
        Outer01 outer01 = new Outer01();
        outer01.test2();
    }

    public static void outer02Test() {
        Outer02.Inner inner1 = new Outer02.Inner();
        inner1.show();
    }

}
