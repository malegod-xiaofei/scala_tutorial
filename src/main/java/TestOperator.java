import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author Malegod_xiaofei
 * @create 2021-07-27-22:16
 */
public class TestOperator {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);
        System.out.println(s1.equals(s2));
    }
}
