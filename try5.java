class try5 {
  public static void main(String[] args) {
    StringBuffer bf = new StringBuffer(2);
    System.out.println(bf.capacity());
    System.out.println(bf.length());
    bf.append("Shrey");
    System.out.println(bf.length());
    System.out.println(bf.capacity());

    bf.ensureCapacity(16);
    System.out.println(bf.length());
    System.out.println(bf.capacity());
    bf.append(" Viradiya");
    System.out.println(bf.length());
    System.out.println(bf.capacity());

    StringBuffer bf1 = new StringBuffer("Shrey");
    StringBuffer bf2 = new StringBuffer("Shrey");

    System.out.println(bf1.hashCode());
    System.out.println(bf2.hashCode());

    bf2.append(" Viradiya");

    System.out.println(bf2.hashCode());

  }
}
