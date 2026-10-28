import java.util.Scanner;

public class whielloops {
    static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while ( name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " +  name);

        scanner.close();


NEW METHOD
        while (1 == 1){
              System.out.println("Help im stuck in loop!! ");

 new
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while ( age < 0 ) {
            System.out.println("your age cant be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old ");

        scanner.close();


         */

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {
            System.out.println("Enter the number between 1 - 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked number " + number);

        scanner.close();
        }

    }

