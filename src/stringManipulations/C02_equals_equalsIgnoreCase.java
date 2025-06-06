package stringManipulations;

public class C02_equals_equalsIgnoreCase {

    public static void main(String[] args) {


        /*
        equals==> verilen 2 String metni karsilastirir
        ikisi de birbiriyle ayni metni iceriyorsa "true",
        icermiyorsa "false" dondurur
         */

        String str1 = "Fatih";
        String str2 = "fatih";
        String str3 = "FATİH";
        String str4 = new String("Fatih");

        System.out.println(str1.equals(str2)); //false

        System.out.println(str1.equals(str3)); //false

        System.out.println(str1.equals(str4)); //true


        System.out.println("===============");

        /*
        equalsIgnoreCase() ==> esitligi kontrol ederken
        buyuk-kucuk harf farkliliklarinin onemsenmemesini
        istedigimizde kullaniriz

         */

        String isim1 = "Emre";
        String isim2= "emre";
        String isim3 = "Emre ";
        String isim4 = "EMRE";

        System.out.println(isim1.equalsIgnoreCase(isim2)); // true

        System.out.println(isim2.equalsIgnoreCase(isim3)); //false

        System.out.println(isim1.equalsIgnoreCase(isim4)); //true






        // equalsIgnoreCase() SADECE kucuk-buyuk harf
        // farkliliklarini ignore ettigi icin
        // space (bosluk) kullandigimizda FALSE dondurur
    }
}
