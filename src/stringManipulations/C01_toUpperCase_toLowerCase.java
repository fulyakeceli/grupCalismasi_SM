package stringManipulations;

import java.util.Locale;

public class C01_toUpperCase_toLowerCase {

    public static void main(String[] args) {



    /*
    Verilen String'i buyuk veya kucuk harfe cevirir

     */

        String str = "String manipulations ogreniyoruz";

        System.out.println(str); // "String manipulations ogreniyoruz";

        System.out.println(str.toUpperCase());
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str.toLowerCase()); //string manipulations ogreniyoruz

        /*
        String'e atama yapmadigimiz muddetce methodlarla
        yapilan degisiklikler kalici olmaz
         */

       // System.out.println(str); //STRİNG MANİPULATİONS OGRENİYORUZ

       // Degisikligin kalici olmasini istersek
        // str = str.toLowerCase(); yapmaliyiz

        /*
        Eger kucuk / buyuk harf kullanirken
        ingilizce disinda bir dili esas almak istersek
        "Locale" secenegini kullaniriz
         */

         String str1 = "java ogrenmek harika";
        System.out.println(str1); //java ogrenmek harika
       // System.out.println(str1.toUpperCase(Locale.forLanguageTag("Tr"))); //JAVA OGRENMEK HARİKA
        System.out.println(str1.toUpperCase(Locale.ENGLISH)); //JAVA OGRENMEK HARIKA
        System.out.println(str1.toUpperCase());



    }
}
