abstract class abs{
  int a;
  abs(){
    a = 10;
  }

  abstract void printA();
}

class X extends abs{
  X(){
  }

  void printA(){
    System.out.println(a);
  }
}

class Try{
  public static void main(String[] args) {
    abs c= new X();
    c.printA();
    try{
      System.out.println(5/0);
    }

    finally{
      System.out.println("In Finally");
    }

    System.out.println("In Main Method");



  }
}
