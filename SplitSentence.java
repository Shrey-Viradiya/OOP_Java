import java.util.Scanner;

class SplitSentence{
  public static void main(String[] args) {
    String str;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    str  = sc.nextLine();

    String sentence[];
    sentence = str.split("[.]");

    String Words[];
    Words = sentence[0].split(" ");
    // Words = str.split(" ");

    for (int i=0; i < Words.length ; i++ ) {
      for (int j = 0; j < Words.length -1 ; j++ ) {
        if (Words[j].length() < Words[j+1].length()) {
          String temp;
          temp = Words[j];
          Words[j] = Words[j+1];
          Words[j+1] = temp;
        }
      }
    }

    for (int i= 0 ; i < Words.length ; i++ ) {
      System.out.print(" " + Words[i]);
    }
    System.out.println(".");
  }
}
