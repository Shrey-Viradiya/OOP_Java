// Demonstrate thread priorities.
class clicker implements Runnable {
  long click = 0;
  Thread t;
  private volatile boolean running = true;
  public clicker(int p) {
    t = new Thread(this);
    t.setPriority(p);
  }
  public void run() {
    while (running) {
      click++;
    }
  }
  public void stop() {
    running = false;
  }
  public void start() {
    t.start();
  }
}

class ThreadPrior {
  public static void main(String args[]) {
    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    clicker hi = new clicker(Thread.MAX_PRIORITY);
    clicker lo = new clicker(Thread.MIN_PRIORITY);
    lo.start();
    hi.start();
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted.");
    }
    lo.stop();
    hi.stop();
    try {
      hi.t.join();
      lo.t.join();
    } catch (InterruptedException e) {
      System.out.println("InterruptedException caught");
    }
    System.out.println("Low-priority thread: " + lo.click);
    System.out.println("High-priority thread: " + hi.click);
  }
}
