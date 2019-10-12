import java.util.Scanner;

class pattern2{
    public static void main(String[] args) {
        int size;
        char ch;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the half diamond size size: ");
        size = s.nextInt();
        System.out.println("Enter the character: ");
        ch = s.next().charAt(0);


        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            
            for (int j = size - i - 1; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(ch);
            }
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(ch);
            }
            
            System.out.println("");

        }
        for (int i = 0; i < size; i++) {
            //Lower Half

            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < size ; j++) {
                System.out.print(ch);
            }
            for (int j = i; j < size - 1 ; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }

        s.close();
    }
}