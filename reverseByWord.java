import java.util.Scanner;

/**
 * reverseByWord
 */
public class reverseByWord {

    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        Scanner S = new Scanner(System.in);


        System.out.println("Enter the String: ");
        s1 = S.nextLine();

        String[] WordArray = s1.split(" ");

        for (int i = 0; i < WordArray.length ; i++) {            
            String x = WordArray[i];
            String reverse = new String();

            for(int j = x.length() - 1; j >= 0; j--)
            {
                reverse = reverse + x.charAt(j);
            }
            // System.out.println(reverse);
            s2 += reverse + " ";
        
        }
        
        System.out.println(s2);

    }
}