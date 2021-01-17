package com.programs;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ImageToBinary {


    public static String[] convert(File file) throws IOException {


        BufferedImage source = ImageIO.read(file);

        int height = source.getHeight();
        int width = source.getWidth();
        int black = Color.black.getRGB();
        int white = Color.white.getRGB();
        String[] s = new String[width];
        String[] output = new String[height];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < height; ++i) {

            for (int k = 0; k < width; ++k) {

                int color = source.getRGB(k, i);


                if (color == black) {
                    s[k] = "1";

                } else if (color == white) {

                    s[k] = "0";
                } else {
                    s[k] = "";
                }

                builder.append(s[k]);

            }


            output[i] = builder.toString();
            builder.setLength(0);

        }


        return output;
    }

}
