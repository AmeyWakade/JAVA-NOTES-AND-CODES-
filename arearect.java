import java.security.PublicKey;
import java.util.Scanner;

public class arearect {
    public static void main(String[] args){

        //calculate area of recatangle

        double widht = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print(("Enter the widht :"));
        widht = scanner.nextDouble();

        System.out.print(("Enter the height :"));
        height = scanner.nextDouble();

        area = widht * height ;

        System.out.println("The area is " + area +" cm²");

    }

}