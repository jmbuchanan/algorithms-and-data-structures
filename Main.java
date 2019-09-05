package com.matt.algorithmsanddatastructures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        //ReverseString
        System.out.println("Reverse String \"Matt\": "
                + ReverseString.reverse("Matt"));
        
        //BubbleSort
        int[] array = new int[] {4,2,7,2,8};
        String strArray = Arrays.toString(array);
        System.out.println("Bubble sort " + strArray + ": "
                + Arrays.toString(BubbleSort.sort(array)));
        
        //InsertionSort
        System.out.println("Insertion sort " + strArray + ": " 
                + Arrays.toString(InsertionSort.sort(array)));

        //MergeSort

        //Factorial
        System.out.println("Factorial of 12: " + Factorial.compute(12));

        //RecursiveFactorial
        System.out.println("Recursive factorial of 12: " + RecursiveFactorial.compute(12));

        //EvaluatePrimeNumber

        //BinaryTreeSearch
    }
}
