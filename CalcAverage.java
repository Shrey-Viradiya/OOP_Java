import java.util.InputMismatchException;
import java.util.Scanner;

class CalcAverage{
    public static double avgFirstN(int N){
        double x;
        x = (double)N + 1;
        x = x/2;
        return x;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the n");
        try{            
            int x = S.nextInt();
            if(x <= 0){
                throw new IllegalArgumentException("Given Number is non-positive");
            }
            System.out.println(avgFirstN(x));
        }
        catch(IllegalArgumentException E){
            System.out.println(E.getMessage());
        }
        catch(InputMismatchException x){
            System.out.println("Non-integer value given");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}