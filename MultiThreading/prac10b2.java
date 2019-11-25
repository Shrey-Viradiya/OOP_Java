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

    synchronized int getVal() {
        return a;
    }

    synchronized void setVal(int ab) {
        a = ab;
    }
}

class counter2 implements Runnable {
    Storage2 a;

    counter2(Storage2 k) {
        a = k;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            a.setVal(i);
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class printer2 implements Runnable{
    Storage2 a;

    printer2(Storage2 k){
        a = k;
    }

    public void run(){
        while (a.getVal() < 100) {
        try {
            System.out.println("Printer: "+a.getVal());
            
            a.notify();
            a.wait();        
            }
         catch (Exception ignored) {
        }
    }    
    }
}