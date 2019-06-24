import java.util.Scanner;

/*
Accepts word as input and checks for each single character letter in the word whether it is a consonant or vowel.
 */

public class VowelConsonant {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        checkWhetherCharacterIsConsonantOrVowel(inputString);
    }

    private static void checkWhetherCharacterIsConsonantOrVowel(String inputString) {
        for(int i=0; i< inputString.length(); i++) {
            if (inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z' || inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
                if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u' ||
                        inputString.charAt(i) == 'A' || inputString.charAt(i) == 'E' || inputString.charAt(i) == 'I' || inputString.charAt(i) == 'O' || inputString.charAt(i) == 'U') {
                    System.out.print("Vowel ");
                } else {
                    System.out.print("Consonant ");
                }
            } else {
                System.out.print("Input is not a letter ");
            }
        }
    }
}
