

import java.util.Scanner;

public class weightconv {
    static void main(String[] args) {

        //weight conversion prog

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("1: Convert kgs to lbs");

        System.out.println("Choose an Option: ");
        choice = scanner.nextInt();

        System.out.println(choice);

        if (choice == 1) {
            System.out.print("Enter the Weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
            else if (choice == 2) {
            System.out.print("Enter the Weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
            else {
            System.out.println("That was not a valid choice");
        }

            scanner.close();

            //declare variables
            //welcome msg
            //prompt for user choice
            //option 1 convert lbs to kgs
            //option2 converts kgs to lbs
            //else print not valid choice


        }
    }

