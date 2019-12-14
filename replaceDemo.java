class replaceDemo{
  public static void main(String[] args) {
    String x = new String("This is a ismarlabolous event");
    x = x.replaceAll("is[\\s+]","was ");
    System.out.println(x);
  }
}
