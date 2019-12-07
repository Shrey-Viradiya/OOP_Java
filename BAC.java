class BAC {
  public static void main(String[] args) {
    Turn obj = new Turn();
    new Thread(new A(obj)).start();
    new Thread(new B(obj)).start();
    new Thread(new C(obj)).start();
  }
}

class Turn{
  boolean a;
  boolean b;
  boolean c;

  Turn(){
    a = false;
    b = true;
    c = false;
  }
}

class A implements Runnable{
  Turn obj;
  A(Turn x){
    obj = x;
  }

  public void run(){

    for (int i= 0; i < 10 ; i ++ ) {

    while(obj.a == false){
      try{
        wait();
      }
      catch(Exception ignored){}
    }
    System.out.println("A");
    obj.a = false;
    obj.c = true;
    try{notify();}catch(Exception ignored){}
    }

  }
}

class B implements Runnable{
  Turn obj;
  B(Turn x){
    obj = x;
  }

  public void run(){

    for (int i= 0; i < 10 ; i ++ ) {

    while(obj.b == false){
      try{
        wait();
      }
      catch(Exception ignored){}
    }
    System.out.println("B");
    obj.b = false;
    obj.a = true;
    try{notify();}catch(Exception ignored){}
    }

  }
}

class C implements Runnable{
  Turn obj;
  C(Turn x){
    obj = x;
  }

  public void run(){
    for (int i= 0; i < 10 ; i ++ ) {

    while(obj.c == false){
      try{
        wait();
      }
      catch(Exception ignored){}
    }
    System.out.println("C");
    obj.c = false;
    obj.b = true;
    try{notify();}catch(Exception ignored){}
    }

  }
}
