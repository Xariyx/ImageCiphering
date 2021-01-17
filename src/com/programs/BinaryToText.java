package com.programs;

import java.nio.charset.StandardCharsets;


public class BinaryToText {


    public static String convert(String[] input) throws Throwable {

        byte[] bytes = new byte[input.length];
        int index = 0;
        for (String string : input) {


            bytes[index] = (byte) Utils.binaryToInt(string);
            Integer.parseInt(string,2);
            index++;
        }


        return new String(bytes, StandardCharsets.UTF_8);
    }
}
