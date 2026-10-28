public class method {
    static void main() {

        //method =  a block of reusable code that is executed when called ()

        /*String name = "Vipra";
        int age = 19;

         happyBirthday(name, age);

        System.out.println(cube(3));

        String fullName = getFullName("AMEY", "Wakade");
        System.out.println(fullName); */

        int age = 12;
        if (ageCheck(age)) {
            System.out.println("you may sign up! ");
        }
        else  {
            System.out.println("you must be 18+ to sign up! ");
        }
    }
    private static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old\n ", age);
    }
    static double square(double number) {
        return number * number;

    }
    static double cube(double number) {
        return number * number * number;
    }
    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
