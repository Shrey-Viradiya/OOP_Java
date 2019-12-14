import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Try{
    public static void main(String[] args) throws Exception {
        File csv = new File("data.csv");

        try{
          BufferedWriter bw = new BufferedWriter(new FileWriter(csv,true));
          bw.append("Manish,20, ");
          bw.close();
        }catch(Exception ignored){
        }

        Scanner x = new Scanner(csv);
        x.useDelimiter("[,\n]");

        while (x.hasNext()) {
            String name = x.next();
            int age = Integer.parseInt(x.next());
            String Add = x.next();

            System.out.println(name);
            System.out.println(age);
            System.out.println(Add);
        }

        x.close();
    }
}
