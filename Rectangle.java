import java.util.Scanner;

class Rectangle{
  double length = 1,width = 1;
  Scanner S = new Scanner(System.in);

  Rectangle(){
    length = 0;
    width =0;
  }

  Rectangle(double x, double y){
    length = x;
    width = y;
  }

  double getLength(){    
    return length;
  }

  double getWidth(){
    return width;
  }

  void setLength(){
    System.out.println("Enter a positive value of length (less than 20): ");
    do{
      length = S.nextDouble();
    }while(length <= 0 || length > 20);
  }

  void setWidth(){
    System.out.println("Enter a positive value of width: (less than 20): ");
    do{
      width = S.nextDouble();
    }while(width <= 0 || width > 20);
  }

  double area(){
    return length * width;
  }

  double perimeter(){
    return 2*(length + width);
  }

  void display(){
   System.out.println("Rectangle: ");
   System.out.println("Length: " + length);
   System.out.println("Width: " + width);
   System.out.println("Area: " + area());
   System.out.println("Perimeter: " + perimeter());
  }

}