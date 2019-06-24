import java.util.Scanner;

/*
Takes a character from the user as input and determines whether the character is capital letter, a small case letter,
a digit or a special symbol.
 */

public class TypeOfCharacter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char inputCharacter = scanner.next().charAt(0);
        determineTheTypeOfCharacter(inputCharacter);
    }

    private static void determineTheTypeOfCharacter(char inputCharacter) {
        if(inputCharacter >= 'A' && inputCharacter <= 'Z') {
            System.out.println("Capital Letter");
        }
        else if(inputCharacter >= 'a' && inputCharacter <= 'z') {
            System.out.println("Small Letter");
        }
        else if(inputCharacter >= '0' && inputCharacter <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Symbol");
        }
    }
}
