package outer;

@FunctionalInterface
interface Animal {
    void shout();
}

@FunctionalInterface
interface Calculate {
    int sum(int a, int b);
}

public class NiMing {
    public static void show() {
        String name = "小花";
        animalShout(new Animal() {
            @Override
            public void shout() {
                System.out.println("匿名类输出：" + name + "喵喵...");
            }
        });
        animalShout(() -> System.out.println("Lambda表达式输出：" + name + "喵喵..."));
        showNum(10, 20, (x, y) -> x + y);
    }

    private static void animalShout(Animal animal) {
        animal.shout();
    }

    private static void showNum(int x, int y, Calculate calculate) {
        System.out.println(x + "+" + y + "=" + calculate.sum(x, y));
    }
}
