package stringManipulations;

public class C17_replaceFirst {

    public static void main(String[] args) {

        /*

        Stringlerden degisecek olanlardan ilkini
        yeniDeger yapar

         */

        String str = "Java candir, selenium heyecan";

        System.out.println(str.replace('a','A')); // JAvA cAndir, selenium heyecAn

         System.out.println(str.replaceFirst("a","A")); // JAva candir, selenium heyecan
        // burda yalnizca ilk a degerini buyuk yapti

        String str1= "Github kullaniyorum";

        System.out.println(str1.replaceFirst("\\w","1")); //1ithub kullaniyorum




    }
}
