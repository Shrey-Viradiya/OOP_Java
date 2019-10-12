import java.lang.Math;

/**
 * RailYatra
 */
public class RailYatra {
    public static void main(String[] args) {
        Compartment comp[] = new Compartment[10];

        for (int i = 0; i < comp.length; i++) {
            int max = 3; 
            int min = 0; 
            int range = max - min + 1; 
            int rand = (int)(Math.random() * range) + min;
            
            if(rand == 0){
                comp[i] = new FirstClass();
                comp[i].notice();
            }else if(rand == 1){
                comp[i] = new Ladies();
                comp[i].notice();
            }else if(rand == 2){
                comp[i] = new General();
                comp[i].notice();
            }else if(rand == 3){
                comp[i] = new Luggage();
                comp[i].notice();
            }
        }
    }
    
}

abstract class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment{
    void notice(){
        System.out.println("You are in First Class!");
    }
}

class Ladies extends Compartment{
    void notice(){
        System.out.println("Ladies Only Compartment");
    }
}

class General extends Compartment{
    void notice(){
        System.out.println("You are in General Class");
    }
}

class Luggage extends Compartment{
    void notice(){
        System.out.println("Luggage only Compartment");
    }
}