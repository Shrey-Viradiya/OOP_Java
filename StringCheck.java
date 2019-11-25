/**
 * StringCheck
 */
public class StringCheck {

    public static void main(String[] args) {
        StringBuffer x = new StringBuffer("Hello");
        StringBuffer y = new StringBuffer("Hello");
        StringBuffer z = x;

        System.out.println(x == y);
        System.out.println(x.equals(y));

    }
}