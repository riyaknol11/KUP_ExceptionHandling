import java.util.Random;
import java.util.Scanner;

public class RandomNumber{
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) +1;

        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;

        while (userNumber != randomNumber) {
            System.out.print("Enter a number between 1 and 100: ");
            //try-catch block to handle the case where the user enters an invalid input
            try {
                userNumber = Integer.parseInt(scanner.nextLine());
                if (userNumber < randomNumber) {
                    System.out.println("Too low");
                } else if (userNumber > randomNumber) {
                    System.out.println("Too high");
                } else {
                    System.out.println("You guessed it!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
