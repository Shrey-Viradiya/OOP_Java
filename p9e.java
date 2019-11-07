import java.util.Scanner;

/**
 * p9d
 */

class LowSalException extends Exception{

    LowSalException(String S) {
        super(S);
    }
}

public class p9e {

    public static void main(String[] args) {
        int empID;
        String empName;
        String Designation;
        double basic;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter empID:");
        empID = S.nextInt();

        System.out.println("Enter Name:");        
        empName = S.nextLine();
        empName = S.nextLine();

        System.out.println("Enter Designation (Manager, Officer, Clerk):");
        Designation = S.nextLine();

        System.out.println("Enter Basic Salary:");
        basic = S.nextDouble();

        Emp e;

        while (true) {
        try {
            e = new Emp(empID,empName,Designation,basic);
            break;
        } catch (LowSalException exception) {
            System.out.println(exception.getMessage());            
        }
        System.out.println("Enter New Basic Salary:");
        basic = S.nextDouble();}

        e.printDET();
    }
    
}


class Emp{
    int empID;
    String empName;
    String Designation;
    double basic;
    double hra;

    Emp(int empID,    String empName,    String Designation,    double basic) throws LowSalException {
        if (basic <= 500) {
            throw new LowSalException("Too much low Salary!");
        }
        this.empID = empID;
        this.empName = empName;
        this.basic = basic;
        this.Designation = Designation;
        calculateHRA();
    }

    void printDET(){
        System.out.println("Employee Id:" + empID);
        System.out.println("Employee Name:" + empName);
        System.out.println("Employee Designation:" + Designation);
        System.out.println("Employee Basic Salary:" + basic);
        System.out.println("Employee HRA:" + hra);
        System.out.println("Employee Net Salary:" + (basic + (basic * hra/100)));

    }

    void calculateHRA()
    {
        if (Designation.equals("Manager") ) {
            hra = 10;
        }
        else if (Designation.equals("Officer") ) {
            hra = 12;
        } else if (Designation.equals("Clerk") ) {
            hra = 5;
        }
    }
}