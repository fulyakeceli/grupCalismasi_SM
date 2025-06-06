package stringManipulations;

public class C09_concatenation {

    public static void main(String[] args) {

        // Istedigimiz String'in sonuna baska bir String ekler

        // Bunu Java'da "+" isareti ile de yapmistik

        String s1 = "Java";
        String s2 = " ";
        String s3 = "guzeldir";
        String s4 = ".";
        String s5 = "";

        System.out.println(s1+s2+s3+s4); // Java guzeldir.

        // ayni islemi concat ile yapalim
        System.out.println(s1.concat(s2.concat(s3.concat(s4)))); //Java guzeldir.

        int sayi1 = 2;
        int sayi2 = 3;

        // Java 32 yazdirin

        System.out.println(s1.concat(s2.concat(sayi2+s5)).concat(sayi1+s5)); // Java 32

        // sayi1 ve sayi2'yi direkt olarak kabul etmedigi icin
        // yanina hiclik koyarak yazdirabiliriz.
    }
}
