import java.util.Scanner;

class TempRect {
  public static void main(String s[]) {
    Rectangle R[] = new Rectangle[5];
    Scanner S = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.println("\n\nEnter the details for Rectangle " + (i + 1));

      R[i] = new Rectangle();
      R[i].setLength();
      R[i].setWidth();
      R[i].display();

    }
    S.close();

  }
}