package stringManipulations;

import java.util.Scanner;

public class C04_length {

    /*

    Verilen bir String'deki karakter sayisini verir

     */

    public static void main(String[] args) {

String str = "Ayyıldızlıkırmızıbayraktaşıyankahramanoğullarından";

        System.out.println(str.length()); //50


        // Yukaridaki str'in son harfini yazdiralim


        System.out.println(str.length()-1); //49

        System.out.println(str.charAt(str.length()-1));










    }
}
