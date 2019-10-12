import java.util.Scanner;

class complex {
    private float real;
    private float imaginary;

    complex(){
        real = 0.0f;
        imaginary = 0.0f;
    }
    
    float getReal(){
        return real;
    }

    float getImaginary(){
        return imaginary;
    }

    void setReal(float x){
        real = x;
    }

    void setImaginary(float x){
        imaginary = x;
    }



    complex Add(complex b){
        complex add = new complex();
        add.setImaginary(b.getImaginary() + imaginary);
        add.setReal(b.getReal() + real);
        return add;
    }

    complex Subtract(complex b){
        complex sub = new complex();
        sub.setImaginary(imaginary - b.getImaginary());
        sub.setReal(real - b.getReal());
        return sub;
    }

    String display(){
        return "" + real + " + " + imaginary + "i ";
    }
}

class complexDemo {
    public static void main(String[] args) {
        complex a = new complex();
        complex b = new complex();

        Scanner S = new Scanner(System.in);

        float temp;

        System.out.println("Enter the real part of complex number A: ");
        temp = S.nextFloat();
        a.setReal(temp);

        System.out.println("Enter the imaginary part of complex number A: ");
        temp = S.nextFloat();
        a.setImaginary(temp);

        System.out.println("Enter the real part of complex number B: ");
        temp = S.nextFloat();
        b.setReal(temp);

        System.out.println("Enter the imaginary part of complex number B: ");
        temp = S.nextFloat();
        b.setImaginary(temp);




        complex add;
        complex sub;

        add = a.Add(b);
        sub = a.Subtract(b);

        System.out.println("Sum of " + a.display() + " and " + b.display() +  " is " + add.display());
        System.out.println("Sub. of " + a.display() + " and " + b.display() +  " is " + sub.display());
    }
    
}