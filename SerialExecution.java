class SerialExecution{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("First");
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Second");
                }
            }
        });

        Thread t3 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Third");
                }
            }
        });

    t1.start();
    try{
    t1.join();
    }catch(Exception ignored){}

    t2.start();
    try{
    t2.join();
    }catch(Exception ignored){}
    
    t3.start();    
}
}