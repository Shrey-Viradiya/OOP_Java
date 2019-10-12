import java.util.*;

class main{

    static int temp_date;
    static int temp_month;
    static int temp_year;

    public static void main(String args[]){
        int date, month, year;
        Scanner S = new Scanner(System.in);
        MyDate D1[] = new MyDate[5];

        System.out.println("Enter the date: ");
        date = S.nextInt();
        System.out.println("Enter the month: ");
        month = S.nextInt();
        System.out.println("Enter the year: ");
        year = S.nextInt();

        while (!(MyDate.isValid(date,month,year))) {
            System.out.println("The Entry is invalid. By default the date will be set to: 1/1/2019");
            System.out.println("Is it Ok? Y/N");

            char choice;

            choice = S.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {
                break;                
            }
            else if(choice == 'N' || choice == 'n'){
                System.out.println("Enter the date again....");
                System.out.println("Enter the date: ");
                date = S.nextInt();
                System.out.println("Enter the month: ");
                month = S.nextInt();
                System.out.println("Enter the year: ");
                year = S.nextInt();
            }
        }

        D1[0] = new MyDate(date,month,year);

        temp_date = date;
        temp_month = month;
        temp_year = year;

        for (int i = 1; i < 5; i++) {
            temp_date++;
            
            if(MyDate.isValid(temp_date,temp_month,temp_year)){
                D1[i] = new MyDate(temp_date,temp_month,temp_year);
            }
            else{
                temp_date = 1;
                temp_month++;
                if (MyDate.isValid(temp_date,temp_month,temp_year)) {
                    D1[i] = new MyDate(temp_date,temp_month,temp_year);
                }else{
                    temp_date = 1;
                    temp_month = 1;
                    temp_year ++;
                    D1[i] = new MyDate(temp_date,temp_month,temp_year);
                }
            }
            
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the highest value of temperature for day "  +  (i+1)  + ": (in Celsius) ");

            double data;

            data = S.nextDouble();

            D1[i].high = new MyDegree(data,"celsius");

            System.out.println("Enter the lowest value of temperature for day "  +  (i+1)  + ": (in Celsius) ");
            
            data = S.nextDouble();

            D1[i].low = new MyDegree(data,"celsius");
        }

        System.out.println("For Celcius: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Date: "  + D1[i].display() + "__ High: " + D1[i].high.celsius + "__Low: " + D1[i].low.celsius);
        }

        System.out.println("For fahrenheit: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Date: "  + D1[i].display() + "__ High: " + D1[i].high.fahrenheit + "__Low: " + D1[i].low.fahrenheit);
        }
    }
}
