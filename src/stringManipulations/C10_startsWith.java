package stringManipulations;

public class C10_startsWith {

    public static void main(String[] args) {

        /*

        Bir string'in baska bir string ike baslayip
        baslamadigini kontrol eder.

        boolean sonuc dondurur.

         */

        // 1- Tek Parametreli

        String str = "Havalar cok sicak";

        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("Havalar")); // true

        System.out.println(str.startsWith("Havalar cok sicak")); //

        System.out.println(str.startsWith("H")); // true

        System.out.println("=================");


        // 2- Cift Parametreli

        // Secilen index ve sonrasi o index ile mi basliyor diye kontrol eder

        System.out.println(str.startsWith("cok", 8)); // true

        System.out.println(str.startsWith("Havalar",3)); // false
    }
}
