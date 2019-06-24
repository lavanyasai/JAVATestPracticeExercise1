import java.util.Scanner;

/*
Reverse of a string.
 */

public class ReverseString {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        reverseString(inputString);
    }

    private static void reverseString(String inputString) {
        String reverse = "";
        for(int i = inputString.length() - 1; i >= 0; i--)
        {
            reverse = reverse.concat(String.valueOf(inputString.charAt(i)));
        }
        System.out.println(reverse);
    }
}
