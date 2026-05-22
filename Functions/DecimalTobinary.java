package Functions;

import java.util.Collection;
import java.util.Collections;

public class DecimalTobinary {
    public static String DecimalToBinary(int n){
    // Handle the edge case where n is 0
    if (n == 0) {
        System.out.println("0");
        return "0";
    }

    StringBuilder res = new StringBuilder();
    
    //Typical calculation for the conversion 
    while (n > 0) {
        res.append(n % 2);
        n = n / 2;
    }

    // Using StringBuilder's built-in reverse method
    res.reverse();

    System.out.println(res.toString());

    return res.toString();
    }


    public static void floatToBinary(double n) {
    // 1. Separate the number into integer and fractional parts
    int integerPart = (int) n;
    double fractionalPart = n - integerPart;

    // 2. Convert the integer part (using Java's built-in tool for simplicity)
    String intBinary = DecimalToBinary(integerPart);
    StringBuilder fracBinary = new StringBuilder();

    // 3. Convert the fractional part
    int precisionLimit = 8;
    
    while (fractionalPart > 0 && fracBinary.length() < precisionLimit) {
        fractionalPart *= 2;
        int bit = (int) fractionalPart; // Get the leading digit (0 or 1)
        fracBinary.append(bit);
        fractionalPart -= bit;          // Strip the leading digit to keep the new fraction
    }

    // 4. Print the final result
    if (fracBinary.length() > 0) {
        System.out.println(intBinary + "." + fracBinary.toString());
    } else {
        System.out.println(intBinary); // If there was no fractional part
    }
}
    public static void main(String[] args) {
        DecimalToBinary(4);
    }
}
