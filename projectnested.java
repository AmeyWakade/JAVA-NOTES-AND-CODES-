import java.util.Scanner;

public class projectnested {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int cols;
        char symbol;

        System.out.println("Enter the number of rows you want to enter:");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns you want to enter:");
        cols = sc.nextInt();
        System.out.println("Enter the symbol you want to enter:");
        symbol = sc.next().charAt(0);

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();


        }
    }
}
