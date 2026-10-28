import java.util.Scanner;

public class quizz {
    static void main(String[] args) {


        //JAVA QUESTION ARRAY
        String[]  questions = {"What is the main function of a router?",
                                "Which part of computer is called the bran",
                                "What Year Facebook Was launched? ",
                                "Who is known as father of computer?",
                                "What was the firs programming Language?"};

        String[][] options = {{"1.Storing Files ", "2.Encrypting Data ", "3.Directing Internet Traffic","4.Gaming"},
                {"1.CPU", "2.Hard Drive","3.RAM","4.GPU"},
                {"1.2000 ", "2.2004 ", "3.2006 ","4.2008"},
                {"1.Steve Jobs ", "2.Bill Gates ", "3.Alan Turing ","4.Charles Babbage"},
                {"1.Java ", "2.Python ", "3.Fortran ","4.R"}};

        int[] answers ={3,1,2,4,3};
        int score = 0;
        int guess = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("Welcome to the Quizz Program!");
        System.out.println("------------------------------");
        System.out.println("Please enter your choice: ");

        for (int i = 0; i < questions.length; i++) {
            System.out.println((questions[i]));

            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your Guess: ");
            guess = input.nextInt();

            if (guess == answers[i]) {
                System.out.println("Congratulations! You guessed correctly!");
                System.out.println("***************************************");
                score++;

            }
            else {
                System.out.println("Wrong Guess!");
                System.out.println("***************************************");
            }

            }
        System.out.println("Your Final score is: " + score + " out of " + questions.length);
        System.out.println(" Thanks for playing!");

        }
    }

