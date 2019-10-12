import java.util.Scanner;

class pattern1{
    public static void main(String[] args) {
        int size;
        char ch;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the triangle size: ");
        size = s.nextInt();
        System.out.println("Enter the character: ");
        ch = s.next().charAt(0);


        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(ch + "  ");
            }
            System.out.println("");
        }


    }
}