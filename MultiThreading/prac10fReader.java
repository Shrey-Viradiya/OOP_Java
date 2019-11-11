// Read in the data.txt file using this program
// to write the data use prac10fReader class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * prac10fReader
 */
public class prac10fReader {

    public static void main(String[] args) {
        File file = new File("data.txt");
        Scanner S;
        try {
            S = new Scanner(file);
            S.useDelimiter("[\n,]");

            while (S.hasNext()) {
                System.out.println("Name: " + S.next() + "\nRoll No: " + S.next() + "\nAddress: " + S.next() + "\nAge: " + S.next() + "\n\n\n");                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
    }
}