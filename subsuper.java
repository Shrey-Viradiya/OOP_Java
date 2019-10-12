class subsuper{
 public static void main(String[] args) {
     y sub = new y(5,20);
     sub.show();
     System.out.println(sub.c);
 }

}

class x{
    int a;
    int b;
    int c = 25;

    void show(){
        System.out.println("a : " + a + "");
    }
}

class y extends x{
    int a;
    int b;

    y(int p, int q){
        a = p;
        this.b = super.b;
    }

    void show(){
        System.out.println("a : " + a + "");
        System.out.println("b : " + b + "");
        System.out.println("b in super : " + super.b + "");
    }

}