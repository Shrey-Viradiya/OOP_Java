import java.util.Scanner;

/**
 * prac5
 */

 
public class prac5 {

    public static void main(String[] args) {
        // prac5a code1 = new prac5a();
        // code1.run();

        // prac5b code2 = new prac5b();
        // code2.run();

        prac5c code3 = new prac5c();
        code3.run();
    }
}

class prac5a {
    void run(){
        // that allows you to create an integer array of 18 elements 
        // with the following values: int A[ ] = 
        // {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0}. 
        // The program computes the sum of element 0 to 14 and stores it at element 15, computes 
        // the average and stores it at element 16 and identifies 
        // the smallest value from the array and stores it at element 17.
        int A[ ] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        A[17] = A[0];

        for(int i=0;i<15;i++){
            A[15] += A[i];           
            if(A[i] < A[17]) A[17] = A[i];
        }

        A[16]= A[15] / 15;

        System.out.println("Sum is " + A[15] + ", Average is " + A[16] + ", Smallest is "+ A[17]);

    }
}

class prac5b {
    void run(){
        //sort given n numbers and display them in 
        //ascending and descending order.
        Scanner S = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array: ");
        n=S.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            System.out.println("Enter Element " + (i+1));
            arr[i] = S.nextInt();

            for(int j=0;j<i;j++){
                if(arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Ascending Order: ");

        for (int x : arr) {
            System.out.println(x);
        }
        
        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Descending Order: ");

        for (int x : arr) {
            System.out.println(x);
        }

    }
}

class prac5c {
    void run(){
        // to add two given matrices and to multiply two given matrices.
        int size;

        Scanner S = new Scanner(System.in);
        size = S.nextInt();

        int[][] A = new int[size][size];
        int[][] B = new int[size][size];
        int[][] C = new int[size][size];
        int[][] D = new int[size][size];

        System.out.println("Enter the matrix A:");
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                A[i][j] = S.nextInt();
            }
        }
        System.out.println("Enter the matrix B:");
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                B[i][j] = S.nextInt();
            }
        }

        System.out.println("Addition A+B is");

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");

                for(int ele=0;ele<size;ele++)  {
                    D[i][j] += A[i][ele] * B[ele][j];
                }
            }
            System.out.println();
        }

        System.out.println("Multiplication A*B is");
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
}