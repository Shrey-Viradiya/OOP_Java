import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
// import java.lang.Math;

public class prac4
{
	public static void main(String[] args) {

		prac4a code1 = new prac4a();		
        code1.run();
        
        // prac4b code2 = new prac4b();		
        // code2.run();
        
        // prac4c code3 = new prac4c();		
		// code3.run();
	}
}

class prac4a{
    boolean isvalid(int x){
        
        if(x < 0 == true) return false;
        else return true;
    }

    int input(){
        Scanner S = new Scanner(System.in);
        int a;
        a = S.nextInt();
        while (!isvalid(a)){
            System.out.println("Try Again");
            a = S.nextInt();
        }
        return a;
    }

    void run(){
        // Write a Java program to decide the following information based on Body Mass Index. 
        // Let the user enter height in feet and inch and weight in pounds (lb). (Hint: 1 feet = 12 inches). 
        // Based on BMI computed, print relevant message i.e if BMI is <18.5 print "Person is Under-weight", 
        // if BMI is >18.5 & < 24.9 print "Person is having Normal  BMI" 
        // & if BMI is >25 & <29.9 print "Person is Over-weight", if BMI>30 print "Person Is Obese".

        // bmi = w(pound)/h(inches)^2 * 703
        //
        // 1 kg = 2.20 pound

        Scanner S = new Scanner(System.in);
        int weight,feet,inches;
        final double coeff = 703.0;
        double BMI = 0;

        System.out.println("Enter Your weight(in pounds): ");
        weight = input();

        System.out.println("Enter Your height (Feet and inches in different lines): ");
        feet = input();
        inches = input();

        //computation begins
        inches += (feet*12);
        BMI = (weight * coeff)/(inches * inches);
        //computation ends

        if(BMI < 0){
            System.out.println("Oho!! take a break... something is wrong...");
        }
        else if(BMI < 18.5){
            System.out.println("Person is Under-weight: "+ BMI);
        }else if(BMI <24.9){
            System.out.println("Person is having Normal BMI: "+ BMI);
        }
        else if(BMI <29.9){
        System.out.println("Person is Over-weight : "+ BMI);
        }
        else{
            System.out.println("Person is obese: "+ BMI);
        }
        
        S.close();
    }
}

class prac4b{
    boolean isvalid(int x){
        
        if(x < 0 == true || x == 1) return false;
        else return true;
    }

    int input(){
        Scanner S = new Scanner(System.in);
        int a;
        a = S.nextInt();
        while (!isvalid(a)){
            System.out.println("\nSlow Down a little. Why so hurry!!? Please enter a Positive value\n");
            a = S.nextInt();
        }
        return a;
    }

    void run(){
        // Write a Java program to find all even numbers between1 and 
        // a given number given as input by user.

        // Scanner S = new Scanner(System.in);
        System.out.println("Enter the end limit:");
        int end = input();


        System.out.println("Even Integers");
        System.out.println("=============");
        for(int i = 1;i <= end; i++){
            if(i %2 == 0){
                System.out.println(i);
            }
        }
    }
}

class prac4c{
    boolean isvalid(int x){
        
        if(x < 0) return false;
        else return true;
    }

    int input(){
        Scanner S = new Scanner(System.in);
        int a;
        a = S.nextInt();
        while (!isvalid(a)){
            System.out.println("\nSlow Down a little. Why so hurry!!? Please enter a Positive value\n");
            a = S.nextInt();
        }
        return a;
    }

    void subcode1(){
        // check whether a number is odd or even (using if – else statement)
        int a;
        System.out.println("check whether a number is odd or even\n");
        System.out.println("Enter an integer: ");
        a = input();

        if(a % 2 == 0)  System.out.println("Even number");
        else System.out.println("Odd number");
    }

    void subcode2(){
        // perform arithmetic operations of a calculator. (using switch case)
        Scanner S = new Scanner(System.in);
        
        double a,b;
        char choice;
        System.out.println("perform arithmetic operations of a calculator");
        System.out.println("Enter the arithmetic operation....\n+\t-\t*\t/\t%\t");
        choice = S.next().charAt(0);
        System.out.println("Enter 2 numbers: ");
        a = S.nextDouble();
        b = S.nextDouble();

        switch(choice){
            case '+':                
                System.out.println(a + " + " + b + " = " + (a+b) );
                break;
                
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b) );
                break;
                
            case '*':
                System.out.println(a + " * " + b + " = " + (a*b) );
                break;
                
            case '/':
                if(b==0) {
                    System.out.println("Invalid Denominator..");
                    break;
                }
                System.out.println(a + " / " + b + " = " + (a/b) );
                break;
                
            case '%':
                if(b==0) {
                    System.out.println("Invalid Denominator..");
                    break;
                }
                System.out.println(a + " % " + b + " = " + (a%b) );
                break;

            default:
                System.out.println("Invalid Input...Check Again!!");
                
        }
        
        S.close();
    }

    void subcode3(){
        //check whether a number is prime or not. 
        int a;
        boolean isPrime = true;
        System.out.println("Enter a number to check whether it is prime or not: ");
        a = input();

        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                System.out.println("Number is Not Prime: ");
                isPrime = false;
                break;
                
            }
            else{
                continue;
            }
        }

        if(isPrime) System.out.println("Number is Prime: ");
    }

    void subcode4(){
        // display reverse of a number and check whether it is palindrome or not. (using while/do while loop)
        int number, temp;
        int pal = 0;
        System.out.println("display reverse of a number and check whether it is palindrome or not");
        System.out.println("Enter the Number");
        number = input();

        temp = number;

        while(temp!=0){
            pal = (pal *10) + (temp%10);
            temp/=10;
        }

        if(pal == number) System.out.println("Number is Palindrome" );
        else System.out.println("Number isn't Palindrome");
    }

    void subcode5(){
        //  check the category of a given character. (using if…else…if ladder)
        char ch;
        Scanner S = new Scanner(System.in);
        System.out.println("check the category of a given character\nEnter a character: ");
        ch = S.next().charAt(0);

        // if (Character.isLetter(ch)) {
        // if(ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
        //     System.out.println("It is a Vowel");
        // }else{
        //     System.out.println("It is a Consonant");
        // }
        // } else if(Character.isDigit(ch)){
        //     System.out.println("It is a Digit");
        // }else if(Character.isWhitespace(ch)){
        //     System.out.println("It is a Whitespace");
        // }else{
        //     System.out.println("Looks like a special character");
        // }

        // if (((int)ch > 64 && (int)ch < 91 ) || ((int)ch > 96 && (int)ch < 123)) {
        
        if ((ch >= 'a' &&ch <= 'z' ) || (ch >= 'A' && ch <= 'Z')) {
            if(ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                System.out.println("It is a Vowel");
            }else{
                System.out.println("It is a Consonant");
            }

        } else if((int)ch > 47 && (int)ch < 58 ){
            System.out.println("It is a Digit");
        }else if(Character.isWhitespace(ch)){
            System.out.println("It is a Whitespace");
        }else{
            System.out.println("Looks like a special character");
        }
    }

    void subcode6(){
        // pattern printing. (using nested loops)

        int size;

        Scanner s = new Scanner(System.in);
        System.out.println("pattern printing");
        System.out.println("Enter the triangle: ");
        size = s.nextInt();


        System.out.println("\n");
        for (int i = 0; i < size ; i++) {
            
            // for (int j = size - i ; j > 0 ; j--) {
            //     System.out.print(" ");
            // }
            // for (int j = 0; j < i ; j++) {
            //     System.out.print(j+1);
            // }
            int k=1;
            for(int j = 0;j < size; j++){
                
                if(j < size-i - 1) System.out.print(" ");
                else System.out.print(k++) ;
            }
            System.out.println("\n");
        }
    }

    void run(){
        // subcode1();
        // subcode2();
        // subcode3();
        // subcode4();
        // subcode5();
        subcode6();
    }
}