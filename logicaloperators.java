import java.util.Scanner;

public class logicaloperators {
    static void main(String[] args) {
        //&& =  AND
        //|| = OR
        //! = Not

        /*double temp = 35;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weathear is GOOD");
            System.out.println("It is sunny outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weathear is GOOD");
            System.out.println("It is Cloudy outside");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weathear is BAD");
            System.out.println("It is Cloudy outside");

         */

        Scanner scanner = new Scanner(System.in);
        //username must be btwn 4-12 char
        //username must not contain spaces or underscores

        String username;

        System.out.println("Enter the username");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be btwn 4 to 12 charachters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");

        } else {
            System.out.println("Welcome " + username);


        scanner.close();

        }
    }
}
