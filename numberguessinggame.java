import java.sql.SQLOutput;

void main() {

    //number guessing game

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min, max + 1);

    //IO.println(randomNumber);

    System.out.println("Number guessing Game ");
    System.out.printf("Guess a number between %d-%d\n" , min , max);

    do {
        System.out.print("Enter a guess: ");
        guess = scanner.nextInt();
        attempts++;

        if (guess < randomNumber){
            System.out.println("Too LOW Try Again");
        } else if (guess > randomNumber) {
            System.out.println("Too high! try again ");
        }
        else {
            System.out.println("Correct! The number was" + randomNumber);
            System.out.println("# of attempts: " + attempts);
        }

    }while (guess != randomNumber);

    System.out.println("You have won!!");
}
