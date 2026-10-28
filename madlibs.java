import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {

        {


            //MAD LIBS GAME
            Scanner scanner = new Scanner(System.in);

            String adjective1;
            String noun1;
            String adjective2;
            String verb1;
            String adjactive3;

            System.out.println("Enter an adjective (desc): ");
            adjective1 = scanner.nextLine();

            System.out.println("Enter a noun (animal or person): ");
            noun1 = scanner.nextLine();

            System.out.println("Enter an adjective: ");
            adjective2 = scanner.nextLine();

            System.out.println("Enter a verb end with -ing (action): ");
            verb1 = scanner.nextLine();

            System.out.println("Enter an adjective: ");
            adjactive3 = scanner.nextLine();

            System.out.println("Today i went to a " + adjective1 + " zoo.");
            System.out.println("In an exhibit, I saw a " + noun1 + ".");
            System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
            System.out.println("I was " + adjactive3 + " ! ");

            scanner.close();


        }


    }
}