import java.util.Scanner;

/*
Reads unspecified number of integer arguments using Scanner class and adds them together.
 */

public class ScannerIntegers {
    public static void main(String args[]) {
        readIntegersAndAddThem();
    }

    private static void readIntegersAndAddThem() {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int inputNumber;
        while((inputNumber = scanner.nextInt()) != 0) {
            sumOfNumbers = sumOfNumbers + inputNumber;
        }
        System.out.println(sumOfNumbers);
    }

}
