package stringManipulations;

public class C13_lastIndexOf {

    public static void main(String[] args) {

        /*

        String veya cahr'in verilen metindeki en son kullanimini bulur
        ve index'ini dondurur

         */

        String str = "Java cok guzel cok";

        System.out.println(str.lastIndexOf("cok")); //15

        System.out.println(str.indexOf("cok")); // 5

        /*

        lastIndexOf'da aramaya baslar ve son kullanimini bize dondurur
        indexOf'da ise bastan baslar ve ilk buldugu kullanimi dondurur
         */


        System.out.println(str.lastIndexOf('x')); //-1

        /*

        Aranan string veya char degerini bulamazsa -1 dondurur

         */


    }
}
