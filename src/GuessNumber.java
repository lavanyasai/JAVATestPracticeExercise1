import java.util.Scanner;

/*
To determine whether the guessed number matches with the original number or not.
 */

public class GuessNumber {
    public static void main(String args[]) {
        int originalNumber = 30;
        checkWhetherTheNumberGuessedIsCorrectOrNot(originalNumber);
    }

    private static void checkWhetherTheNumberGuessedIsCorrectOrNot(int originalNumber) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        while(true) {
            inputNumber = scanner.nextInt();
            if(originalNumber > inputNumber) {
                System.out.println("Number guessed is less than original number");
            }
            else if(originalNumber < inputNumber) {
                System.out.println("Number guessed is more than original number");
            }
            else {
                System.out.println("Number guessed matches the original number");
                break;
            }
        }
    }
}
