
import java.util.Scanner;

public class pizza {
    public static void main(String[] args){

        //shopping cart prog

        Scanner scanner = new Scanner(System.in);

        String item;
        double price ;
        int quantity;
        char currency = '$';
        double total;

        System.out.print(" What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print(" whar is price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? : ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\n You have bought " + quantity + " " + item + "/s" );
        System.out.println(" Your Total is " + currency + total);

        scanner.close();
    }
}

