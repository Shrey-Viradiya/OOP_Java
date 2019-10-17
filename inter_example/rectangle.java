package inter_example;

public class rectangle implements Polygon{
    float length = 0;
    float width = 0;
    float area = 0;
    float perimeter = 0;

    public rectangle(float l, float w){
        length = l;
        width = w;
    }

    public void calcArea(){
        area = length*width;
    }

    public void calcPeri(){
        perimeter = 2 * (length + width);
    }

    public void display( ){
        System.out.println(area);
        System.out.println(perimeter);
    }

}