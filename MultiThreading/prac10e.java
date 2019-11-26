// To run this program use...
// java prac10e file1.txt file2.txt

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * prac9e
 */
public class prac10e {
    public static void main(String[] args) {

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Thread t = new Thread(new printData2(new File(args[0])));
        Thread t2 = new Thread(new printData2(new File(args[1])));

        // IllegalArgumentException in this method
        // t.setPriority(+2);
        // t2.setPriority(-2);

        t.setPriority(Thread.NORM_PRIORITY - 3);
        t2.setPriority(Thread.NORM_PRIORITY);

        t.start();
        try{t.join();}catch(Exception ignored){}
        t2.start();
    }
    
}

class printData2 implements Runnable {
    File file;

    printData2(File file) {
        this.file = file;
    }

    @Override
    public void run() {

        Scanner input;

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        }

        while (input.hasNextLine()) {
            System.out.println(file.getName() +" "+ input.nextLine());
        }
    }
}
