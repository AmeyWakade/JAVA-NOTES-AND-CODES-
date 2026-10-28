import java.util.Scanner;

public class bankingsys {


static Scanner sc = new Scanner(System.in);

    static void main( String[] args) {


        // java banking program for beginners

        double balance = 0 ;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            System.out.println("BANKING PROGRAM");
            System.out.println("*********************************");
            System.out.println("1.Show balance:");
            System.out.println("2. Deposit:");
            System.out.println("3. Withdraw:");
            System.out.println("4. Exit:");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }
        System.out.println("Thank you for using Banking System");

        }

        static int showBalance(double balance ){
            System.out.println("********************************");
            System.out.printf("$%.2f\n" , balance);

            return 0;
        }


        static double deposit() {

            System.out.print("Enter amount to deposit:");
            double amount = sc.nextDouble();

            if(amount <= 0 ){
                System.out.println("Invalid amount");
                return 0;
            }
            else{
                   return amount ;
            }
        }


        static double withdraw(double balance ){
            System.out.print("Enter amount to withdraw:");
            double amount = sc.nextDouble();

            if(amount > balance ){
                System.out.println("INSUFFICIENT BALANCE");
            }
            else if(amount < balance){
                System.out.println("Amount cannot be negative");
            }
            else{
                return 0;
            }


            return amount;
        }

    }

