import java.util.Scanner ;


public class substring {

    static void main() {
        // .substring() =  A method used to extract a portion of a string
        //                 string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your Email: ");

         email = scanner.nextLine();
         username = email.substring(0, email.indexOf("@"));
         domain = email.substring(email.indexOf("@") + 1);


        System.out.println(username);
        System.out.println(domain);

        scanner.close();
    }
}
