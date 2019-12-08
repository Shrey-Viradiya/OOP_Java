class ThreadEx{
  public static void main(String[] args) {
    // new Thread(new Runnable(){
    //   public void run(){
    //   for (int i=0; i <1000 ; i++ ) {
    //     System.out.println("A" + i);
    //   }
    // }
    // }).start();
    // new Thread(new Runnable(){
    //   public void run()
    //   {
    //   for (int i=0; i <1000 ; i++ ) {
    //     System.out.println("B" + i);
    //   }
    // }
    // }).start();


    Thread t = new Thread(new A());
    t.start();
    try{
      t.join();
    }
    catch( Exception ignored ){}
    System.out.println("After The Execution of Thread t");
  }
}

class A implements Runnable{
  public void run(){
    for (int i=0; i <10 ; i++ ) {
      System.out.println("B" + i);
    }
  }
}
