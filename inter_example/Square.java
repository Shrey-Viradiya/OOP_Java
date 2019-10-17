package inter_example;

public class Square implements Polygon{
    float area = 0;
    float perimeter = 0;
    float side = 0;
    
    public Square(float s){
        side = s;
    }
    
    public void calcArea(){
        area = side*side;
    }

    
    public void calcPeri(){
        perimeter = 4 * side;
    }

    

    
    public void display( ){
        System.out.println(area);
        System.out.println(perimeter);
    }

}