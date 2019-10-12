import java.util.Scanner;
import java.lang.Math;

public class prac3
{
	public static void main(String[] args) {
		// prac3a code1 = new prac3a();
		
		// code1.run();
		
		// prac3b code2 = new prac3b();
		
		// code2.run();

        // prac3c code3 = new prac3c();
        
        // code3.run();
        
        prac3d code4 = new prac3d();
        
        code4.run();
	}
}


class prac3a{
    void run(){
        // Write a Java program using class that prints the numbers 1 to 50. 
        // For all multiples of 3 print "Fizz" and for all multiples of 5 print "Bizz". 
        // For multiples of both 3 and 5 print "Fizz-Bizz".
        
        for(int i=1;i<=50;i++){
		    
		    if(i%15 == 0){
		        System.out.println("Fizz-Bizz");
		    }else if(i%3 == 0){
		        System.out.println("Fizz");
		    }else if(i%5 == 0){
		        System.out.println("Bizz");		        
		    }else{
		        System.out.println(i);
		    }
    }
}
}

class prac3b{
    void run(){
        // Demonstrate concept of Arithmetic & Bitwise Operators with a java program. 
        // Operands to be considered as per the operators entered by the user.
        Scanner S = new Scanner(System.in);
        
        double a,b;
        int x,y;
        char choice;
        
        System.out.println("Enter the arithmetic operation....\n+\t-\t*\t/\t%\t&\t|\t^\nleft shift(l)\tright shift(r)\tunsigned right shift(u)\t~\nincrement\tdecrement");
        choice = S.next().charAt(0);

        switch(choice){
            case '+':
                System.out.println("Enter 2 numbers: ");
                a = S.nextDouble();
                b = S.nextDouble();
                System.out.println(a + " + " + b + " = " + (a+b) );
                break;
                
            case '-':
                System.out.println("Enter 2 numbers: ");
                a = S.nextDouble();
                b = S.nextDouble();
                System.out.println(a + " - " + b + " = " + (a-b) );
                break;
                
            case '*':
                System.out.println("Enter 2 numbers: ");
                a = S.nextDouble();
                b = S.nextDouble();
                System.out.println(a + " * " + b + " = " + (a*b) );
                break;
                
            case '/':
                System.out.println("Enter 2 numbers: ");
                a = S.nextDouble();
                b = S.nextDouble();
                if(b==0) {
                    System.out.println("Invalid Denominator..");
                    break;
                }
                System.out.println(a + " / " + b + " = " + (a/b) );
                break;
                
            case '%':
                System.out.println("Enter 2 integers: ");
                x = S.nextInt();
                y = S.nextInt();
                System.out.println(x + " % " + y + " = " + (x%y) );
                break;
                
            case '&':
                System.out.println("Enter 2 integers: ");
                x = S.nextInt();
                y = S.nextInt();
                System.out.println(x + "(" + Integer.toBinaryString(x) + ")" + " & " + y + "(" + Integer.toBinaryString(y) + ")" + " = " + (x&y) + "(" + Integer.toBinaryString((x&y)) + ")"  );
                break;
                
            case '|':
                System.out.println("Enter 2 integers: ");
                x = S.nextInt();
                y = S.nextInt();
                System.out.println(x + "(" + Integer.toBinaryString(x) + ")" + " & " + y + "(" + Integer.toBinaryString(y) + ")" + " = " + (x|y) + "(" + Integer.toBinaryString((x|y)) + ")"  );
                break;
                
            case '^':
                System.out.println("Enter 2 integers: ");
                x = S.nextInt();
                y = S.nextInt();
                System.out.println(x + "(" + Integer.toBinaryString(x) + ")" + " & " + y + "(" + Integer.toBinaryString(y) + ")" + " = " + (x^y) + "(" + Integer.toBinaryString((x^y)) + ")"  );
                break;

            case 'l':
                System.out.println("Enter 2 integers: ");
                x = S.nextInt();
                y = S.nextInt();
                System.out.println(x + "(" + Integer.toBinaryString(x) + ")" + " << " + y + "(" + Integer.toBinaryString(y) + ")" + " = " + (x<<y) + "(" + Integer.toBinaryString((x<<y)) + ")"  );
                break;

            case 'r':
                System.out.println("Enter 2 integers: ");
                x = S.nextInt();
                y = S.nextInt();
                System.out.println(x + "(" + Integer.toBinaryString(x) + ")" + " >> " + y + "(" + Integer.toBinaryString(y) + ")" + " = " + (x>>y) + "(" + Integer.toBinaryString((x>>y)) + ")"  );
                break;
                
            case 'u':
                System.out.println("Enter 2 integers: ");
                x = S.nextInt();
                y = S.nextInt();
                System.out.println(x + "(" + Integer.toBinaryString(x) + ")" + " >>> " + y + "(" + Integer.toBinaryString(y) + ")" + " = " + (x>>>y) + "(" + Integer.toBinaryString((x>>y)) + ")"  );
                break;

            case '~':
                System.out.println("Enter an integers: ");
                x = S.nextInt();
                
                System.out.println("~"+ x + "(" + Integer.toBinaryString(x) + ")" + " = " + (~x) + "(" + Integer.toBinaryString((~x)) + ")"  );
                break;

            case 'i':
                System.out.println("Enter an integers: ");
                x = S.nextInt();
                ++x;
                System.out.println("++"+ (x-1) + "(" + Integer.toBinaryString(x-1) + ")" + " = " + (x) + "(" + Integer.toBinaryString((x)) + ")"  );
                break;

            case 'd':
                System.out.println("Enter an integers: ");
                x = S.nextInt();
                --x;
                System.out.println("--"+ (x+1) + "(" + Integer.toBinaryString(x+1) + ")" + " = " + (x) + "(" + Integer.toBinaryString((x)) + ")"  );
                break;
            default:
                System.out.println("Invalid Input...Check Again!!");
                
        }
        
        S.close();
    }
}

class prac3c{
    boolean isvalid(int mark){
        if(mark > 100 == true)  return false;
        else if(mark < 0 == true) return false;
        else return true;
    }

    void result(int mark){
        if(mark < 34){
            System.out.println(mark + ": FAILED");
        }else{
            System.out.println(mark + ": PASSED");
        }
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
        //Write a java program which generates student grade report in console. 
        // Take student roll number and marks (out of 100) of 5 courses from user. 
        // Calculate the percentage and display grade of the student. 
        // Use appropriate control statements.
        Scanner S = new Scanner(System.in);
        // int a,b,c,d,e;
        //int total = 0;
        // double percent;


        
        // System.out.println("Enter marks 1: ");
        // a = input();

        // System.out.println("Enter marks 2: ");
        // b = input();

        // System.out.println("Enter marks 3: ");
        // c = input();

        // System.out.println("Enter marks 4: ");
        // d = input();

        // System.out.println("Enter marks 5: ");
        // e = input();
        
        
        
        // result(e);

        // total = a+b+c+d+e;
        // percent = total/5;


        int i = 1;
        double percent = 0;
        do {
            // Scanner Sc = new Scanner(System.in);
            int temp;
            System.out.println("Enter the marks of subject " + i);
            temp = S.nextInt();
            while (!isvalid(temp)){
                System.out.println("Try Again");
                temp = S.nextInt();
            }
            percent += temp/5;
            i++;
        } while (i != 6);

        
        
        

        
        if(percent > 90 == true){
            System.out.println("Percentage is " + percent + "% and Grade id A+");
        }else if(percent > 80 == true){
            System.out.println("Percentage is " + percent + "% and Grade id A");
        }else if(percent > 70 == true){
            System.out.println("Percentage is " + percent + "% and Grade id B+");
        }else if(percent > 60 == true){
            System.out.println("Percentage is " + percent + "% and Grade id B");
        }else if(percent > 50 == true){
            System.out.println("Percentage is " + percent + "% and Grade id C+");
        }else if(percent > 40 == true){
            System.out.println("Percentage is " + percent + "% and Grade id C");
        }else{
            System.out.println("Percentage is " + percent + "% and Grade id F");
        }
        
        S.close();
    }
}

class prac3d{
    
    boolean isvalid(double radius){
        if(radius <= 0)  return false;        
        else return true;
    }

    void run(){
        // Write a program to calculate area and perimeter of a circle. 
        // Take the value of radius from user.
        
        double radius = 1;
        
        Scanner S = new Scanner(System.in);

        do {
            if(!isvalid(radius)){
                System.out.println("\nSlow Down a little. Why so hurry!!? Please enter a Positive value\n");
            }
            System.out.println("Enter the value of radius: ");
            radius = S.nextDouble();
        } while (!isvalid(radius));
        
        
        
        System.out.println("The area of circle is "+ (Math.PI * radius * radius)+ " and the perimeter is " + (2 * Math.PI * radius));
        S.close();
    }
}