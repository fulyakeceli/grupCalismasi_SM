package stringManipulations;

public class C03_charAt {

    public static void main(String[] args) {


        /*

        Bize istenen indexteki harfi dondurur
        Java'da index 0'dan baslar
        Bu nedenle ilk harf icin index "0" olur.

         */

        String str = "Cumhuriyet hurriyet demek";

        System.out.println(str.charAt(0)); //C

        System.out.println(str.charAt(5)); // r

        System.out.println(str.charAt(10)); //

        // son index==> toplamKarakterSayisi-1 ile bulunur
        // Yukaridaki ornekte toplam Karakter sayisi = 25'tir
        // son index

        System.out.println(str.charAt(24)); // k


        // NOT: Son indexten daha buyuk bir index
        // yazarsak java HATA verir

       // System.out.println(str.charAt(30)); // StringIndexOutOfBoundsException

        System.out.println("======================");

       String abc = "Java guzeldir";

        //karakter sayisinin 13 oldugunu biliyorsak
        // sondan 3. karakteri yazdirin



        System.out.println( abc.charAt(13-3)); //d


    }
}
