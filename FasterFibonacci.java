class Fibonacci{
  static long arr[] = new long[90];
  static{
    arr[0] = 1;
    arr[1] = 1;
  }

  static long term(int n){
    if(n>=90){
      System.out.println("Not Valid");
      return -1;
    }
    if(arr[n] != 0){
      return arr[n];
    }
    else{
      arr[n] = term(n-1) + term(n-2);
      return arr[n];
    }
  }

  static long fibTerm(int n){
    if(n == 0 || n== 1){
      return 1;
    }
    else{
      return fibTerm(n-1) + fibTerm(n-2);
    }
  }
}

class FasterFibonacci {
  public static void main(String[] args) {

    long startTime = System.currentTimeMillis();
    for (int i=0; i<40 ;i++ ) {
      System.out.println(Fibonacci.term(i));
    }

    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println(elapsedTime);

    startTime = System.currentTimeMillis();
    for (int i=0;i<40 ;i++ ) {
      System.out.println(Fibonacci.fibTerm(i));
    }
    stopTime = System.currentTimeMillis();
    elapsedTime = stopTime- startTime;
    System.out.println(elapsedTime);
  }
}
