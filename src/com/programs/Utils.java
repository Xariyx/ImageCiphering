package com.programs;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Utils {


    public static Object input(String description, Scanner scanner) {
        System.out.println(description + " ");

        return scanner.nextLine();
    }



    public static String longestStringFromArray(String[] strings) {

        String longestString = "";

        for (String string : strings) {
            int length = longestString.length();
            if (string.length() > length) {

                longestString = string;
            }
        }
        int endLength = longestString.length();
        if (endLength == 0) {
            return null;
        }

        return longestString;
    }



    public static int binaryToInt(String binary) {

        int length = binary.length();
        int[] values = new int[length];
        int index = length - 1;
        for (int value : values) {
            values[index] = (int) pow(2, index);
            index--;

        }

        int[] vars = new int[length];
        int index2 = length - 1;
        for (char aChar : binary.toCharArray()) {

            if (aChar == '1') {
                vars[index2] = 1;

            }
            if (aChar == '0') {
                vars[index2] = 0;

            }

            index2--;

        }

        int result = 0;
        int index3 = length - 1;
        for (int var : vars) {
            result += vars[index3] * values[index3];
            index3--;
        }

        return result;
    }


}