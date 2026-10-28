import java.util.Scanner;

public class calculator {
    static void main(String[] args) {

        // coumpund interest calculator

        Scanner scanner =  new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.println("Enter the Principal Amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the intrest rate (in %) : ");
        rate = scanner.nextDouble()/ 100;

        System.out.println("Enter the # of times compunded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded,timeCompounded * years );

        System.out.printf("The amount after %d years is  $%.2f" , years , amount ) ;






        scanner.close();

    }
}
