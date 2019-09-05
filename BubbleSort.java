
package com.matt.algorithmsanddatastructures;

public class BubbleSort {
    public static int[] sort(int[] array) {
        
        boolean isSorted = false;
        
        while (!isSorted) {
            for (var i = 0; i < array.length - 2; i++) {
                
                //if current element is greater than next
                if (array[i] > array[i + 1]) {

                    int lesser = array[i + 1];
                    int greater = array[i];

                    //swap current and next element
                    array[i] = lesser;
                    array[i + 1] = greater;

                }
            }
            
            //assuming sorted until check finds otherwise
            boolean keepGoing = false;
            
            //check for out of order elements
            for (var i = 0; i < array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    keepGoing = true;
                }
            }
            
            //if no out of order elements are found, break while loop
            if (!keepGoing) {
                isSorted = true;
            }
            
        }
        return array;
    }
}
