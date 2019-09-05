
package com.matt.algorithmsanddatastructures;

public class ReverseString {
    public static String reverse(String reverseStringInput) {
        String reversedString = new String();
        for (var i = 0; i < reverseStringInput.length(); i++) {
            reversedString = reverseStringInput.charAt(i) + reversedString;
        }
        return reversedString;
    }
}
