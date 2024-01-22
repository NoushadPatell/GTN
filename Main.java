import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Define the range of numbers in which you wanna play ! ex:(0 - 100)");
        System.out.print("Enter starting point : ");
        int start = scanner.nextInt();
        System.out.print("Enter ending point : ");
        int end = scanner.nextInt();
        int attempts = 3;
        System.out.println("You have to guess the number between " + start + " - " + end + ", and you have " + attempts + " attempts to try");
        int random_number = random.nextInt((end - start) + 1) + start;
        int guess;
        for(int i = 1; i < 4; i++) {
            System.out.print(i + "ST TRY : ");
            guess = scanner.nextInt();
            if(guess == random_number) {
                System.out.println("That is correct guesss !! ");
                System.out.println("The random no is : " + random_number);
                return;
            }
            if(guess > random_number) {
                System.out.println("Your guess is probably higher than the random value !! ");
            } else {
                System.out.println("Your guess is probably lower than the random value !! ");
            }
        }
        System.out.println("You have failed the test !! ");
        System.out.println("Actually the random value was : " + random_number);
    }
}
