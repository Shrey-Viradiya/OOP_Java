/**
 * StringS
 */
public class StringS {

    public static void main(String[] args) {
        String c = new String("Hola");
        String b = c;

        c = c.toLowerCase();

        System.out.println(b==c);
    }
}