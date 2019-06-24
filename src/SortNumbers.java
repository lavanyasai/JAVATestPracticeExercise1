import java.util.Arrays;
import java.util.Scanner;

/*
Accepts the numbers as input from user and perform the following:
1. Sorts the numbers in non-increasing order
2. After sorting, sum of all even numbers is calculated and checked if it is greater than 15.
3. If sum is greater than 15, prints true else prints false
 */

public class SortNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        char[] inputStringArray = inputString.toCharArray();
        Arrays.sort(inputStringArray);
        String order = new String(inputStringArray);
        StringBuilder stringBuilder = new StringBuilder(order);
        order = stringBuilder.reverse().toString();
        sortNumbersAndAddEvenNumber(order);
    }

    private static void sortNumbersAndAddEvenNumber(String order) {
        int sumOfNumbers = 0;
        System.out.println("Sorted number in non-increasing order : " + order);
        for(int i=0; i<order.length(); i++) {
            if((Character.getNumericValue(order.charAt(i))%2) == 0) {
                sumOfNumbers = sumOfNumbers + Character.getNumericValue(order.charAt(i));
            }
        }
        System.out.println("Sum of even numbers : " + sumOfNumbers);
        if(sumOfNumbers > 15) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
