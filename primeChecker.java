/**
 * primeChecker
 */

import java.util.Scanner;
class primeChecker {

    public static void main(String[] args) {
        int number;
        boolean isPrime = true;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number: ");
        number = s.nextInt();

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("The number is Prime");
        }
        else System.out.println("The number is not Prime");

        s.close();
    }
}