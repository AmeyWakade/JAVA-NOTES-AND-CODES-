import java.util.Scanner;

public class mathex {
    static void main(String[] args) {
        //circumference = 2 * Math.PI * radius
        //area = Math.PI * Math.pow(radius, 2);
        //vaolume = (4.0 /3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        //System.out.println("The circumference is: " + circumference + "cm");
        //System.out.println("The area is: " + area + "cm²");
        //System.out.println("The volume is: " + volume + "cm³");

        System.out.printf("the circum is: %.1fcm\n",  circumference);
        System.out.printf(" the ares is: %.1fcm²\n", area);
        System.out.printf("The vol is: %.1fcm³\n", volume);

    }
}


