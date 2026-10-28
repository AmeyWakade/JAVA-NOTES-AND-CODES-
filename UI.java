import java.util.Scanner;

 class main  {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Enter your Name: ");
        String name =  scanner.nextLine();

        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.println("What is you gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println(" are you a student? (true/false); ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);

        if (isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("you are NOT enrolled");
        }
        scanner.close();

    }
}