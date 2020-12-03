package stringTest;

/**
 * String字符串是final类型，定义的字符串是常量不可修改，修改字符串即意味着新建字符串对象
 */
public class StringTest {
    public static void test() {
        String s = "abcdefghihgfedcbaabcdefghihgfedcba";
        System.out.println("字符串长度：" + s.length());
        System.out.println("字符串中第一个字符：" + s.charAt(0));
        System.out.println("字符串c第一次出现的位置：" + s.indexOf('c'));
        System.out.println("字符串c最后一次出现的位置：" + s.lastIndexOf('c'));
        System.out.println("子串第一次出现的位置：" + s.indexOf("ab"));
        System.out.println("子串最后一次出现的位置：" + s.lastIndexOf("ab"));
        String s1 = "java";
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                System.out.print(chars[i] + ",");
            } else {
                System.out.println(chars[i]);
            }
        }
        System.out.println("int转String:" + String.valueOf(123));
        System.out.println("字符串转大写：" + s1.toUpperCase());

        String s2 = "       http :// localhost : 8080   ";
        System.out.println("去除字符串两端空格：" + s2.trim());
        System.out.println("去除字符串中所有空格：" + s2.replace(" ", ""));

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = "2020-12-02";
        String[] strings = s5.split("-");
        System.out.print("分割的字符串数组：");
        for (int i = 0; i < strings.length; i++) {
            if (i != strings.length - 1) {
                System.out.print(strings[i] + "、");
            } else {
                System.out.print(strings[i]);
            }
        }
    }
}
