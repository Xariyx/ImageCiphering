package com.programs;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;


public class BinaryToImage {


    public static BufferedImage convert(String[] strings) {


        int width = Objects.requireNonNull(Utils.longestStringFromArray(strings)).length();

        int height = strings.length;
        BufferedImage bufferedImage = new BufferedImage(
                width,
                height,
                BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();


        int line = 0;
        int index = 0;

        for (String string : strings) {
            char[] chars = string.toCharArray();


            for (char aChar : chars) {

                if (aChar == '1') {
                    g2d.setColor(Color.black);
                }

                if (aChar == '0') {
                    g2d.setColor(Color.white);
                }

                g2d.fillRect(index, line, 1, 1);
                index++;

            }

            if (string.length() < width) {
                g2d.setColor(new Color(128,128,128));
                g2d.drawLine(width, line, string.length(), line);


            }

            index = 0;
            line++;
        }


        g2d.dispose();
        return bufferedImage;
    }

}
