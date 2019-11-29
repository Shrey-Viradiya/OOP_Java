class ThreadsName{
  public static void main(String[] args) {
    Thread t= Thread.currentThread();

    System.out.println("Before Name Change: " + t);
    t.setName("The ThreadsName Change main Thread");
    System.out.println("After Change: " + t);

    try {
    for(int n = 5; n > 0; n--) {
        System.out.println(n);
        Thread.sleep(1000,120);
        System.out.println(Thread.currentThread().isAlive());
      }
    }catch( Exception ignored){}

  }


}
