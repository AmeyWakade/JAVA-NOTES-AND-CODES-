import java.util.Scanner;

public class arrasinput {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("Enter the number of food items: ");
        size = scan.nextInt();
        scan.nextLine();

        foods = new String[size];

        /*foods[0] = "pizza";
        foods[1] = "chapati";
        foods[2] = "cheese";*/

        for(int i = 0; i < foods.length; i++){
            System.out.println("Enter food " + (i + 1) + ":");
            foods[i] = scan.nextLine();
        }


        for(String food : foods)
            System.out.println(food);

        System.out.println(foods.length);
        scan.close();
    }
}
