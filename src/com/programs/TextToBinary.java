package com.programs;



public class TextToBinary {



    public static String[] convert(String text) {

        byte[] bytes = text.getBytes();
        int index = 0;

        String[] output = new String[text.length()];

        for (byte aByte : bytes) {

            output[index] = Integer.toBinaryString(Byte.toUnsignedInt(aByte));
            index++;
        }


        return output;
    }


}


