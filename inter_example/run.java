package abc;
import inter_example.*;

public class run {

    public static void main(String[] args) {
        Square s = new Square(5);
        rectangle r = new rectangle(5, 3);

        s.calcArea();
        s.calcPeri();
        r.calcArea();
        r.calcPeri();

        s.display();
        r.display();

    }
} 