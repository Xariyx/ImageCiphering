package com;

import com.programs.BinaryToImage;
import com.programs.BinaryToText;
import com.programs.ImageToBinary;
import com.programs.TextToBinary;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

import static com.programs.Utils.input;

public class Loader {

    public static void load() throws Throwable {

        Scanner scanner = new Scanner(System.in);
        choice(GUI(scanner),scanner);


    }


    private static void choice(Object object,Scanner scanner) throws Throwable {
        if(object.equals("1")){

            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("    You selected ciphering     ");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("    Write message to cipher    ");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("");

            Object obj = input("", scanner);

            BufferedImage image = BinaryToImage.convert(TextToBinary.convert((String) obj));

            System.out.println("   Write name of file to save  ");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("              Rules:           ");
            System.out.println("Name can't have special symbols");
            System.out.println("You can specify path by using /");
            System.out.println("");
            System.out.println("             Example:          ");
            System.out.println("C:\\Users\\John\\Desktop\\Secret");
            System.out.println("Secret                         ");
            System.out.println("");
            System.out.println("If you dont specify path,      ");
            System.out.println("Message will be stored where   ");
            System.out.println(".jar File is located           ");
            System.out.println("-------------------------------");
            System.out.println("");
            Object obj2 = input("", scanner);
            File file = new File(obj2 + ".png");
            ImageIO.write(image, "png", file);
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("         Message Ciphered!     ");
            System.out.println("");
            System.out.println("-------------------------------");
        }


        else if(object.equals("2")){
            System.out.println("   Write name of file to read  ");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("              Rules:           ");
            System.out.println("Name can't have special symbols");
            System.out.println("You can specify path by using /");
            System.out.println("");
            System.out.println("             Example:          ");
            System.out.println("C:\\Users\\John\\Desktop\\Secret");
            System.out.println("Secret                         ");
            System.out.println("");
            System.out.println("If you dont specify path,      ");
            System.out.println("Message will be read from where");
            System.out.println(".jar File is located           ");
            System.out.println("-------------------------------");
            System.out.println("");
            Object obj2 = input("", scanner);
            File file = new File(obj2 + ".png");
            String deciphered = BinaryToText.convert(ImageToBinary.convert(file));
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("        Message Deciphered!    ");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("            Content:           ");
            System.out.println(deciphered);
            System.out.println("");



        }
        else {
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("    You selected wrong mode!   ");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("[!]    Restarting program   [!]");
            System.out.println("");
            System.out.println("-------------------------------");
            GUI(scanner);


        }



    }

    private static Object GUI(Scanner scanner){

        System.out.println("-------------------------------");
        System.out.println("Welcome in ImageCipher Program!");
        System.out.println("-------------------------------");
        System.out.println("        Select mode:           ");
        System.out.println("");
        System.out.println("1 -Ciphering text");
        System.out.println("");
        System.out.println("2 -Deciphering text");
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("");
        Object obj = input("", scanner);
        System.out.println("");

        return obj;

    }

}
