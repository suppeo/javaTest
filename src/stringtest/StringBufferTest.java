package stringtest;

/**
 * StringBuffer类似字符串容器可以对字符串内容和长度进行修改，不会新建StringBuffer对象，
 * StringBuffer的equal方法没有重写，不能用来对StringBuffer字符串内容进行比较
 * StringBuffer之间不能进行+ 操作
 * StringBuilder与StringBuffer功能相似，但没有实现线程安全功能，性能略高
 */
public class StringBufferTest {
    public static void test() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ABC");
        System.out.println("添加的结果为：" + stringBuffer);
        stringBuffer.insert(2, "DE");
        System.out.println("插入的结果为：" + stringBuffer);
        stringBuffer.setCharAt(2, 'A');
        System.out.println("修改指定位置的字符结果：" + stringBuffer);
        stringBuffer.replace(3, 5, "FG");
        System.out.println("替换指定位置的字符串结果为：" + stringBuffer);
        stringBuffer.reverse();
        System.out.println("字符串翻转的结果为：" + stringBuffer);
        stringBuffer.append("123456");
        stringBuffer.delete(3, 7);
        System.out.println("删除指定位置结果：" + stringBuffer);
        stringBuffer.deleteCharAt(2);
        System.out.println("删除指定位置结果：" + stringBuffer);
        stringBuffer.delete(0, stringBuffer.length());
        System.out.println("清空字符串缓冲区：" + stringBuffer);
    }
}
