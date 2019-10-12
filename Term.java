import java.util.Scanner;

class Term {

    int coefficient;
    int exponent;

    Term(){
        coefficient = exponent = 0;
    }

    // void setTerm(int a,int b){
    //     coefficient =a;
    //     exponent = b;
    // }

    public static void main(String[] args) {
        Polynomial P = new Polynomial();
        P.sort();
        P.display();
    }
}

class Polynomial{
    int size;
    Term arr[];
    Scanner S = new Scanner(System.in);
    int termno = 0;

    Polynomial(){
        System.out.println("Enter the number of terms in Polynomial: ");
        size = S.nextInt();
        arr = new Term[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Term();
            int coef,exp;
            System.out.println("Enter the coefficient: ");
            coef = S.nextInt();

            System.out.println("Enter the exponent: ");
            exp = S.nextInt();

            for (int j = 0; j < i; j++) {
                if(arr[j].exponent == exp){
                    System.out.println("Enter the exponent that is not taken: ");
                    exp = S.nextInt();
                }
            }
            while (exp < 0) {
                System.out.println("Enter the positive exponent: ");
                exp = S.nextInt();
            }

            this.setTerm(coef, exp);
        }
    }

    void setTerm(int a,int b){
        if (termno >= size) {
            System.out.println("Terms exceeded!");
            return;
        }
        arr[termno].coefficient =a;
        arr[termno].exponent = b;
        termno++;

    }

    void sort(){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].exponent > arr[j].exponent) {
                    Term temp ;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void display(){
        System.out.println("\nPolynomial is:\n");
        for (Term x : arr) {
            System.out.print("" + x.coefficient+"X^"+x.exponent+" ");
        }
    }
}