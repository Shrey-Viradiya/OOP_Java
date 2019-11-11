
public class Example {
    public static void main(String[] args) {
        new Thread(new X()).start();
        new Thread(new Y()).start();
        new Thread(new X()).start();
    }    
}

class X implements Runnable{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}

class Y implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}