class prac10b2 {
    public static void main(String[] args) throws InterruptedException {
        Storage2 x = new Storage2();

        Thread t = new Thread(new counter2(x));
        Thread t2 = new Thread(new printer2(x));

        t.start();
        t2.start();
    }
}

class Storage2 {
    int a;

    synchronized void getVal() {
        System.out.println("Thrown: " + a);
try{        notify();
        wait();
}catch(Exception ignored){}
    }

    synchronized void setVal(int ab) {
        a = ab;
        System.out.println("Got: " + a);
        try {
            notify();
            wait();
        } catch (Exception e) {
        }
    }
}

class counter2 implements Runnable {
    Storage2 a;

    counter2(Storage2 k) {
        a = k;
    }

    public void run() {
        for (int i = 0; i < 100; i++){
            a.setVal(i);
        }
        }
    }

class printer2 implements Runnable{
    Storage2 a;

    printer2(Storage2 k){
        a = k;
    }

    public void run(){
        while (true) {
            a.getVal();
    }    
    }
}