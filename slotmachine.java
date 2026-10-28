
//Decalre variables
//Display Welcome Message
//PLay if balance > 0
// Enter Bet amount
//    Verify if bet > Balance
// Verify if Bet > o
//substaract bet from balance
//spin Row
//PRINT ROW
//Get payout
//ASk to play again
//Display the EXIT TEXT
import java.util.Random;
import java.util.Scanner;

public class slotmachine {
    static void main() {
        // Java Slot machine

        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int bet;
        int payout;
        String[] row;
        String Playagain;

        System.out.println("*****************************");
        System.out.println("Welcome to Java Slot Machine");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("*****************************");

        while (balance > 0) {
            System.out.println("Current Balance: $" + balance);
            System.out.println("Place your bet amount: ");
            bet = sc.nextInt();
            sc.nextLine();

            if (bet > balance) {
                System.out.println("INSUFFICENT FUNDS ");
                continue;
            } else if (bet <= 0) {
                System.out.print("Bet must be grater than 0 ");
            } else {
                balance -= bet;
            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won: $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry You Lost This Round");
            }
            System.out.print("Do you want to continue? (Y/N) ");
            Playagain = sc.next().toUpperCase();

            if (!Playagain.equals("Y")) {
                break;
            }
        }

        System.out.println("Game Over! Your final Balance: " + balance);
        sc.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random rand = new Random();


        for (int i = 0; i < 3; i++) {

            row[i] = symbols[rand.nextInt(symbols.length)];
        }


        return row;

    }

    static void printRow(String[] row) {
        System.out.println("********************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("********************");

    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

            return 0;
        }


}

