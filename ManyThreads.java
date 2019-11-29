class ThreadLoop implements Runnable{
  ThreadLoop(String name){
    Thread t = new Thread(this, name);
    System.out.println("New Thread: " + t);
    t.start();
  }

  public void run(){
    try{
      for (int i = 0; i <10 ; i++ ) {
        System.out.println(i);
        Thread.sleep(1000*i);
      }
    }
    catch(Exception ignored){}
  }
}

class ManyThreads{
  public static void main(String[] args) {
    ThreadLoop arr[] = new ThreadLoop[5];

    for (int i = 0;i<5;i++) {
      arr[i] = new ThreadLoop("Thread #"+i);
    }

    System.out.println("Main thread Exiting");
  }
}
