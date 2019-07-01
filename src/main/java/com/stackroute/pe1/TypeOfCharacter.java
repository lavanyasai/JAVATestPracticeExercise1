package com.stackroute.pe1;

import java.util.Scanner;

/*
Takes a character from the user as input and determines whether the character is capital letter, a small case letter,
a digit or a special symbol.
 */

public class TypeOfCharacter {

    public static String determineTheTypeOfCharacter(char inputCharacter) {
        String result = "";
        if(inputCharacter >= 'A' && inputCharacter <= 'Z') {
            result = "Capital Letter";
        }
        else if(inputCharacter >= 'a' && inputCharacter <= 'z') {
            result = "Small Letter";
        }
        else if(inputCharacter >= '0' && inputCharacter <= '9') {
            result = "Digit";
        }
        else {
            result = "Special Symbol";
        }
        return result;
    }
}
