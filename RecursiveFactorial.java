
package com.matt.algorithmsanddatastructures;

public class RecursiveFactorial {
    public static int compute(int input) {
        int aggregate;
        if (input < 1) {
            return 1;
        }
        else {
            aggregate = input * RecursiveFactorial.compute(input - 1);
            return aggregate;
        }
    }
}
