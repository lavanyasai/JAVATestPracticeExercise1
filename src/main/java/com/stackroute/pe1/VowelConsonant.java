package com.stackroute.pe1;

import java.util.Scanner;

/*
Accepts word as input and checks for each single character letter in the word whether it is a consonant or vowel.
 */

public class VowelConsonant {

    public static String checkWhetherCharacterIsConsonantOrVowel(String inputString) {
        String result = "";
        for(int i=0; i< inputString.length(); i++) {
            if (inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z' || inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
                if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u' ||
                        inputString.charAt(i) == 'A' || inputString.charAt(i) == 'E' || inputString.charAt(i) == 'I' || inputString.charAt(i) == 'O' || inputString.charAt(i) == 'U') {
                    result = result + "Vowel ";
                } else {
                    result = result + "Consonant ";
                }
            } else {
                result = result + "Input is not a letter ";
            }
        }
        return result;
    }
}
