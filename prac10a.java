
/**
 * prac10a
 */
public class prac10a {
    public static void main(String[] args) {
        Thread t = new Thread(new Counter());
        Thread t2 = new Thread(new Printer());

        t.start();
        t2.start();
    }
    
}

class Storage{
    static int a;

    static int getValue(){
        return a;
    }

    static void setValue(int b){
        a = b;
    }
}

class Counter implements Runnable{
    public void run(){
        for (int i = 0; i < 100000; i++) {
            Storage.setValue(i);
        }
    }
}

class Printer implements Runnable{
    public void run(){
        for (int i = 0; i < 20000; i++) {
            System.out.println(Storage.getValue());
        }
        
    }
}