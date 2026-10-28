import java.util.Scanner;

public class mathclass {

    static void main(String[] args) {

        //System.out.println(Math.PI );
        //System.out.println(Math.E);

        double result;

        //result = Math.pow(2, 4);
        //result = Math.abs( -5);
        //result = Math.sqrt(9);
        //result = Math.round(3.12);
        //result = Math.ceil(3.12);
        //result = Math.floor(3.12);
        //result = Math.max( 10, 20);
        //result = Math.min(10, 20);

        //System.out.println(result);


        // HYPOTENUSE c = Math.sqrt(a2 + b2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of Side A ");
        a = scanner.nextDouble();

        System.out.println("Enter the length of Side B ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));


        System.out.println("The hypotenuse (side c) is: " + c + " cm");

        scanner.close();
    }
}
