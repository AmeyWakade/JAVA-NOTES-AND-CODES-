import java.sql.SQLOutput;
import java.time.MonthDay;
import java.util.Scanner;

public class enhanced {
    static void main(String[] args) {

        //Enhanced switch = A replacement to many else if stmt
        //                    (java 14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine() ;

        switch (day){
            //case "Monday" -> System.out.println("It is a weekday");
            //case "Tuesday" -> System.out.println("It is a weekday");
            //case "Wednesday" -> System.out.println("It is a weekday");
            //case "Thursday" -> System.out.println("It is a weekday");
            //case "Friday" -> System.out.println("It is a weekday");

            case "Monday", "Tuesday" , "Wednesday" , "Thursday" , "Friday" -> System.out.println("Its a weekday!!");

            //case "Saturday" -> System.out.println("It is a weekend");
            //case "Sunday" -> System.out.println("It is a weekend");
            case "Saturday" , "Sunday" -> System.out.println("Its is a Weekend!! ");

            default -> System.out.println( day + " Is not a day");

        }

    }
}
