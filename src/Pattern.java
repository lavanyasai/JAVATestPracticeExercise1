import java.util.Scanner;

/*
Prints the following pattern
1
22
333
4444
55555
.
.
.
nth iteration
 */

public class Pattern {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        printPattern(inputNumber);
    }

    private static void printPattern(int inputNumber) {
        for(int i=0; i<=inputNumber; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
