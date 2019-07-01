package com.stackroute.pe1;

import java.util.Scanner;

/*
To determine whether the input specified is even or odd.
 */

public class EvenOdd {

    public static String checkWhetherNumberIsEvenOrOdd(int inputNumber) {
        String result = "";
        if(((inputNumber%2)==0) && (inputNumber >= 20 && inputNumber <=30)) {
            result = "Jerry";
        }
        else if(((inputNumber%2)!=0) && (inputNumber >= 20 && inputNumber <=30)){
            result = "Tom";
        }
        else {
            result = "Input is incorrect";
        }
        return result;
    }
}
