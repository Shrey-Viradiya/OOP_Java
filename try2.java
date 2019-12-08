class parent{
   static void pl(){
    System.out.println("Static of parent called");
  }

  void pl2(){
    System.out.println("Simple of parent called");
  }

  private void pl3(){
    System.out.println("private of parent called");
  }
}

class child extends parent{
   static void pl(){
    System.out.println("Static of child called");
  }

  void pl2(){
    System.out.println("Simple of child called");
  }

  private void pl3(){
    System.out.println("private of child called");
  }

  public static void main(String[] args) {
    child x = new child();
    x.pl3();
  }
}

class try2{
  public static void main(String[] args) throws Exception {
    parent x = new child();

    x.pl();
    x.pl2();
    throw new Exception("Exiting With Exception");
  }
}
