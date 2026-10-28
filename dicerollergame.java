import java.util.Random;
import java.util.Scanner;

public class dicerollergame {
    public static void main(String[] args) {

        //Java DICE ROLLER

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = sc.nextInt();

        if (numOfDice > 0){
            for (int i = 0; i < numOfDice; i++) {
                int roll = rand.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled a " + roll + " dice ");
                total += roll;
            }
            System.out.println("Total is " + total);
        }
        else {
            System.out.println("No of dice must be greater than 0");
        }

            sc.close();
        }

        static void printDie(int roll) {

        String dice1 = """
                -------
                |       |
                |   ●   |
                |       |
                """ ;
            String dice2 = """
                -------
                |●      |
                |       |
                |     ● |
                """ ;
            String dice3 = """
                -------
                |●      |
                |   ●   |
                |     ● |
                """ ;
            String dice4 = """
                -------
                |●     ●|
                |       |
                |●     ●|
                """ ;
            String dice5 = """
                -------
                |●     ●|
                |   ●   |
                |●     ●|
                """ ;
            String dice6 = """
                -------
                |●     ●|
                |●     ●|
                |●     ●|
                """ ;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}





