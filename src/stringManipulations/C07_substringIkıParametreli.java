package stringManipulations;

public class C07_substringIkıParametreli {

    public static void main(String[] args) {


        /*

     Girilen iki index'ten baslangic dahil,
     bitis haric kadar olan kismini dondurur


         */

        String str = "Java ogrenmek cok kolay";

        System.out.println(str.substring(0,1)); // J

        System.out.println(str.substring(3,9)); // a ogre

        System.out.println(str.substring(0,4)); // Java

        System.out.println(str.substring(10,13)); // mek

        System.out.println(str.substring(14,18)); // cok

        System.out.println(str.substring(0,str.length())); // Java ogrenmek cok kolay

        System.out.println(str.substring(5,5)); //




        /*

        Ayni index'leri verirsek hiclik yazdirir

         */
    }
}
