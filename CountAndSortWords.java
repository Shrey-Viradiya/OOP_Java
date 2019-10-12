import java.util.Scanner;

/**
 * CountAndSortWords
 */
public class CountAndSortWords {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String par = new String();
        

        System.out.println("Enter the Paragraph");
        par = S.nextLine();

        String[] WordArray = par.split("[?!.]");
        // String[] SortedArray = new String[WordArray.length];

        for (int i = 0; i < WordArray.length - 1; i++) {
            for (int j = i + 1; j < WordArray.length; j++) {
                
                if(WordArray[i].split(" ").length > WordArray[j].split(" ").length){
                    String temp;
                    temp = WordArray[i];
                    WordArray[i] = WordArray[j];
                    WordArray[j] = temp;
                }
                // SortedArray[i] = temp;
            }
        }

        System.out.println("\n\nOutput");
        System.out.println("======");

        for (int i = 0; i < WordArray.length; i++) {
            String x = WordArray[i].trim();
            System.out.println(x + ": " + x.split(" ").length + " \n\n");
        }



    }
}