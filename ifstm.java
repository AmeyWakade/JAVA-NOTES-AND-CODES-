import java.util.Scanner;

public class ifstm {
    public static void main(String[] args) {


        //if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age = 0;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println(" Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student? ");
        isStudent = scanner.nextBoolean();

        //group 1
        if (name.isEmpty()){
            System.out.println(" you didnt entered your name! ");
        }
        else {
            System.out.println("Hello " + name + "!");
        }


        //group 2
          if (age >= 65){
            System.out.println("You are an senior!");
        }

          else if (age >= 18) {

            System.out.println("You are an adult! ");

        }

        else if (age < 0) {
                System.out.println("You haven't been born yet!  ");

        } else if (age == 0) {
            System.out.println("You are a gay ");
        }

        else {

            System.out.println("You are a child! ");
        }

        //group 3

        if (isStudent == true){
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student");
        }

    }
}
