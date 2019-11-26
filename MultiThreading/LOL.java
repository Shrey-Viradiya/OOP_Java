class LOL {
    public static void main(String[] args) {
        Object t = new Object();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i = i + 2) {
                    synchronized (t) {
                        System.out.println("Even: "+ i);
                        try {
                            t.notify();
                            t.wait();
                        } catch (Exception e) {
                        }
                    }

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i < 100; i = i + 2) {
                    synchronized (t) {
                        System.out.println("Odd: "+i);
                        if(i==99){
                            t1.interrupt();
                            break;
                        }
                        try {
                            t.notify();
                            t.wait();
                        } catch (Exception e) {
                        }
                    }
                    
                }
            }
        });

        t1.start();
        t2.start();
    }
}