public interface Polygon{  

    void display( );
    abstract void calcArea( );
    abstract void calcPeri( );
    
}

class square implements Polygon{
    float area = 0;
    float perimeter = 0;
    float side = 0;
    
    @Override
    void calcArea(){
        area = side*side;
    }

    @Override
    void calcPeri(){
        perimeter = 4 * side;
    }

    square(float s){
        side = s;
    }

    @Override
    void display( ){
        System.out.println(area);
        System.out.println(perimeter);
    }

}

class rectangle implements Polygon{
    float length = 0;
    float width = 0;
    float area = 0;
    float perimeter = 0;

    rectangle(float l, float w){
        length = l;
        width = w;
    }

    @Override
    void calcArea(){
        area = length*width;
    }

    @Override
    void calcPeri(){
        perimeter = 2 * (length + width);
    }

    @Override
    void display( ){
        System.out.println(area);
        System.out.println(perimeter);
    }

}

