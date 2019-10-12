class rectangle
{
    double length,width;
    rectangle(){
        length = 10;
        width = 10;
    }

    rectangle(int x,int y){
        length = x;
        width = y;
    }

    double area()
    {
        return(length*width);
    }
    void display()
    {
        System.out.println("Rectangle with length = " + length + " width = " + width);
    }
}

/**
 * prac6
 */
public class prac6 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.display();
        System.out.println(r.area());
    }    
}