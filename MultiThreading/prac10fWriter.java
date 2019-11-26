// write in the data.txt file using this program
// to read the data use prac10fWriter class

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


class EmptyFieldException extends Exception {
    EmptyFieldException(String Message){
        super(Message);
    }
}

public class prac10fWriter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String Name;
        while (true) {
            System.out.println("Enter the Name: ");
            try {
                Name = s.nextLine();
                if(Name.trim().equals("")) throw new EmptyFieldException("Name Can't be empty");
                break;
            } catch (EmptyFieldException E) {
                System.out.println(E.getMessage());
            }
        }

        System.out.println("Roll No.");
        int rollNo;
        while (true) {
            try{
                rollNo = s.nextInt();
                break;
            }catch(Exception E){
                System.out.println(E.getMessage());
            }
        }
        System.out.println("Age:");
        int age;
        while (true) {
            try{
                age = s.nextInt();
                break;
            }catch(Exception E){
                System.out.println(E.getMessage());
            }
        }

        String Address;
        while (true) {
            System.out.println("Enter the Address: ");
            try {
                s.nextLine();
                Address = s.nextLine();
                if(Address.trim().equals("")) throw new EmptyFieldException("Address Can't be empty");
                break;
            } catch (EmptyFieldException E) {
                System.out.println(E.getMessage());
            }
        }

        System.out.println("Want to write to a file? YES/NO");
        String choice;
        while (true) {
            System.out.println("Enter the Choice: ");
            try {
                choice = s.nextLine();
                if(choice.trim().equals("")) throw new EmptyFieldException("choice Can't be empty");
                
                if (choice.toLowerCase().contains("yes")) {
                    File f = new File("data.txt");
                    try{
                    BufferedWriter pw =new BufferedWriter(new FileWriter(f,true));
                    pw.append(Name).append(",").append("" + rollNo).append(",").append(Address).append(",").append("" + age).append("\n");
                    pw.flush();
                    pw.close();
                }catch(FileNotFoundException E){
                    System.out.println("File Not Found... Writing Data Failed");
                }
                catch(Exception ignored){}
                }
                else if (choice.toLowerCase().contains("no")) {
                    return;
                }
                
                break;
            } catch (EmptyFieldException E) {
                System.out.println(E.getMessage());
            }
        }

    }    
}