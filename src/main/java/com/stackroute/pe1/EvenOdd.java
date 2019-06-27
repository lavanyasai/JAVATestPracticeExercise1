package com.stackroute.pe1;

import java.util.Scanner;

/*
To determine whether the input specified is even or odd.
 */

public class EvenOdd {

    public static String checkWhetherNumberIsEvenOrOdd(int inputNumber) {
        if(((inputNumber%2)==0) && (inputNumber >= 20 && inputNumber <=30)) {
            return "Jerry";
        }
        else if(((inputNumber%2)!=0) && (inputNumber >= 20 && inputNumber <=30)){
            return "Tom";
        }
        else {
            return "Input is incorrect";
        }
    }
}
