public class string {
    static void main() {

        String name = "Amey";

        //int length = name.length();
        //char letter = name.charAt(5);
        //int index = name.indexOf(" ");
        //int lastIndex =  name.lastIndexOf("o");


        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("o", "a");

        /*
        if (name.isEmpty()){
            System.out.println("your name is empty!!");
        }
        else {
            System.out.println("Hello " + name);
        }



        if (name.contains(" ")){
            System.out.println("Your name contains a space!!");
        }
        else {
            System.out.println("your name doesnt contain space!!");
        }

         */

        if (name.equalsIgnoreCase("passwords")){
            System.out.println("Your name cant be password");
        }
        else {
            System.out.println("hello " + name);
        }
    }

}
