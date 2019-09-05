
package com.matt.algorithmsanddatastructures;

public class Factorial {

    public static int compute(int input) {
        int aggregate = 1;
        for (var i = input; i > 1; i--) {
            aggregate *= i;
        }
        return aggregate;
    }
    
}
