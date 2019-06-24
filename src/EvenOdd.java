import java.util.Scanner;

/*
To determine whether the input specified is even or odd.
 */

public class EvenOdd {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        checkWhetherNumberIsEvenOrOdd(inputNumber);
    }

    private static void checkWhetherNumberIsEvenOrOdd(int inputNumber) {

        if(((inputNumber%2)==0) && (inputNumber >= 20 && inputNumber <=30)) {
            System.out.println("Jerry");
        }
        else if(((inputNumber%2)!=0) && (inputNumber >= 20 && inputNumber <=30)){
            System.out.println("Tom");
        }
        else {
            System.exit(0);
        }
    }
}
