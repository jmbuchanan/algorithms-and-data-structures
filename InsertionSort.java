
package com.matt.algorithmsanddatastructures;

public class InsertionSort {
    static int[] sort(int[] array) {
        
        for (var i = 0; i < array.length; i++) {
            
            int compare = array[i];
            
            int j = i - 1;
            
            while (j >= 0 && compare < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = compare;
        }
        return array;
    }
}
