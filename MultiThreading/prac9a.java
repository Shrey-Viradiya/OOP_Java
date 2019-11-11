class prac9a{
    public static void main(String[] args) throws InterruptedException {
        Storage x = new Storage();
        
        
        Thread t = new Thread(new counter(x));
        Thread t2 =  new Thread(new printer(x));

        t.start();
        t2.start(); 
    }
}

class Storage{
    int a;

    int getVal(){
        return a;
    }

    void setVal(int ab){
        a = ab;
    }
}

class counter implements Runnable{
    Storage a;

    counter(Storage k){
        a = k;
    }


    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                synchronized(a){
                    a.setVal(i);
                    System.out.println("Counter Thread: "+a.getVal());
                    a.notify();
                    a.wait();
                    
                }
            } catch (Exception ignore) {
            }
            
        }
    }
}

class printer implements Runnable{
    Storage a;

    printer(Storage k){
        a = k;
    }

    public void run(){
        while (a.getVal() < 100) {
        try {
            synchronized(a){
                    System.out.println("Printer: "+a.getVal());
                    
                    a.notify();
                    a.wait();
                
            }
        } catch (Exception ignored) {
        }
    }    
    }
}


