import java.util.Scanner;
import java.time.Instant;
import java.time.Duration;

public class count {
    public static void main(String[] args) {
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        Scanner sc=new Scanner(System.in);
        String line = new String();

        System.out.println("Enter Your String");
        line=sc.nextLine();


        Instant start = Instant.now();
        line = line.toLowerCase();


        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            //     ++vowels;
            // }
            // else if((ch >= 'a'&& ch <= 'z')) {
            //     ++consonants;
            // }
            // else if( ch >= '0' && ch <= '9' )
            // {
            //     ++digits;
            // }
            // else if (ch ==' ')
            // {
            //     ++spaces;
            // }
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    ++vowels;
                    break;

                case ' ':
                    ++spaces;
                    break;

                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    ++digits;
                    break;

                default:
                    ++consonants;
                    break;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(timeElapsed);
    }
}
