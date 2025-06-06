package stringManipulations;

public class C12_indexOf {

    public static void main(String[] args) {

        /*

        Bir string icerisinde aradigimiz bir string veya
        char degerin ilk kullanim indexini dondurur

        2 parametre kullanirsak aramaya hangi indexten
         baslayacagini da belirtiriz

         */

        String str = "Java candir,selenium heyecan";

        System.out.println(str.indexOf("candir")); // 5

        System.out.println(str.indexOf('a')); //1

        System.out.println(str.indexOf('k')); // -1

        System.out.println(str.indexOf("heyecan")); // 21

        String str1 = "Java cok guzel, cok";

        System.out.println(str1.indexOf("cok", 6 )); //16


    }
}
