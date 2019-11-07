import java.util.Scanner;

class Number {

    int a,b;
    double result;

    Number(int x, int y){
        a = x;
        b = y;
    }

    void add(){
        result = a+b;
    }

    void sub(){
        result = a-b;
    }

    void multiply(){
        result = a*b;
    }

    void divide() throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Can't devide by zero");
        }
        else{
            result = a/b;
        }
    }
}

class Number2 {

    public static void main(String[] args) {
        Number x = new Number(32, 0);
        Scanner S = new Scanner(System.in);

        
        Exe:
        while(true){
            System.out.println("Choices:\n1: Add\n2: Subtract\n3: Multiply\n4: Devide");
            int choice;

            choice = S.nextInt();

            switch(choice){
                case 1:
                    x.add();
                    System.out.println(x.result);
                    break;
                case 2:
                    x.sub();
                    System.out.println(x.result);
                    break;

                case 3:
                    x.multiply();
                    System.out.println(x.result);
                    break;

                case 4:
                try{
                    x.divide();
                    System.out.println(x.result);
                
                }
                catch(ArithmeticException E){
                    System.out.println("Can't divide by zero");
                }
                    break;

                case 5:
                    break Exe;
            }
        }
        
        
    }
    
}