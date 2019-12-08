class try4{
  public static void main(String[] args) {
    try{
      System.out.println(5/0);
    }
    catch(NumberFormatException e){
      System.out.println(e.getMessage());
    }
    finally{
      System.out.println("In finally");
    }
    System.out.println("After Nested ");

  }
}
