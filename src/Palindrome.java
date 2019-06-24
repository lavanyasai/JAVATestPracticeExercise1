import java.util.Scanner;

/*
To determine whether the input string is a Palindrome or not.
 */

public class Palindrome {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(inputString);
        String reverseOfAString = stringBuilder.reverse().toString();
        checkWhetherStringIsPalindromeOrNot(inputString, reverseOfAString);
    }

    private static void checkWhetherStringIsPalindromeOrNot(String inputString, String reverseOfAString) {
        int sum = 0;
        if(inputString.equals(reverseOfAString)) {
            for(int i=0; i< reverseOfAString.length(); i++) {
                if(Character.getNumericValue(inputString.charAt(i))%2==0) {
                    sum = sum + Character.getNumericValue(inputString.charAt(i));
                }
            }
            if(sum > 25) {
                System.out.println(inputString + " is palindrome and sum of even numbers is greater than 25");
            }
            else {
                System.out.println(inputString + " is palindrome and sum of even numbers is less than 25");
            }
        }
        else {
            System.out.println(inputString + " is not palindrome");
        }
    }
}
