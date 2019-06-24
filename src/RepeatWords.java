import java.util.Scanner;

/*
Repeats the specified number of letters for given number of times.
 */

public class RepeatWords {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int repeatStringInput = scanner.nextInt();
        repeatSpecifiedWords(inputString, repeatStringInput);
    }

    private static void repeatSpecifiedWords(String inputString, int repeatStringInput) {
        int length = inputString.length();
        String constant = inputString.substring(0, length-repeatStringInput);
        String repeat = inputString.substring(length-repeatStringInput);
        System.out.print(constant);
        for(int i=0; i<=repeatStringInput ;i++) {
            System.out.print(repeat);
        }
    }
}
