package stringManipulations;

import java.util.Scanner;

public class C05_lengthOrnek {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini isteyin
        //ismin ilk harfini
        // ve soy ismin son harfini
        // ikisi de buyuk harf olacak sekilde
        // yan yana yazdirin


Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        char isminIlkHarfi = Character.toUpperCase(isim.charAt(0));
        char soyisimSonHarf = Character.toUpperCase(soyisim.charAt(soyisim.length()-1));

        System.out.println("" + isminIlkHarfi + soyisimSonHarf);



    }
}
