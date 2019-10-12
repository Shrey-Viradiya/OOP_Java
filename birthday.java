import java.util.Scanner;

class birthday{    

    public static void main(String[] args) {
        int d,m,y;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Date: ");
        d = s.nextInt();
        System.out.println("Enter Month: ");
        m = s.nextInt();
        System.out.println("Enter Year: ");
        y = s.nextInt();

        if(d <= 0 || m <= 0 || m >=13 || y<=0 || d >= 31){ //Simple Error
            System.out.println("Invalid Date");
        }
        else if((y % 4 == 0 && y % 100 != 0) && m == 2 && d > 29){ //checking whether leap year
            System.out.println("Invalid Date");
        }
        else if(!(y % 4 == 0 && y % 100 != 0) && m == 2 && d > 28){ //checking whether not leap year
            System.out.println("Invalid Date");
        }
        else if((m == 1 ||m == 3 ||m == 5 ||m == 7 ||m == 8  || m == 10 || m == 12) && d>31){ //check date according to month
            System.out.println("Invalid Date");
        }
        else if((m == 4 ||m == 6 ||m == 9 ||m == 11) && d>30){ //check date according to month
            System.out.println("Invalid Date");
        }
        else System.out.println("Birthdate is " + d + "/" + m + "/" + y);
    }
    
}