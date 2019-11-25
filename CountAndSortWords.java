import java.util.Scanner;

/**
 * CountAndSortWords
 */
public class CountAndSortWords {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String par;
        

        System.out.println("Enter the Paragraph");
        par = S.nextLine();

        String[] WordArray = par.split("[?!.]");

        for (int i = 0; i < WordArray.length; i++) {
            WordArray[i] = WordArray[i].replaceAll("\\s+", " ");
        }

        for (int i = 0; i < WordArray.length - 1; i++) {
            for (int j = i + 1; j < WordArray.length; j++) {
                
                if(WordArray[i].trim().split(" ").length > WordArray[j].trim().split(" ").length){
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