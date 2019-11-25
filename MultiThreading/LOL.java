class scrap {

}

class LOL {
    public static void main(String[] args) {
        scrap t = new scrap();

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
                            // TODO Auto-generated catch block
                            e.printStackTrace();
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
                        
                        try {
                            t.notify();
                            t.wait();
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    
                }
            }
        });

        t1.start();
        t2.start();
    }
}