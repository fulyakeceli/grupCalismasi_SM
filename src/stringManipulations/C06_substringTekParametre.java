package stringManipulations;

public class C06_substringTekParametre {

    public static void main(String[] args) {

        /*

        Girilen index'ten itibaren String'in
        sonuna kadar olan kismi bize dondurur

         */

        String str ="Java candir";

        System.out.println(str.substring(3)); // a candir

        System.out.println(str.substring(5)); // candir

        System.out.println(str.substring(10)); // r


        System.out.println("===============================");

       //  sondan 3 karakterden itibaren yazdirmak istersek

        System.out.println(str.substring(str.length()-3)); // dir

        System.out.println(str.charAt(str.length()-3)); // d


        /*

        charAt() bize verdigimiz index'i yazdirirken,
        substring o index'ten itibaren geri kalanini yazdirir

         */

        System.out.println(str.charAt(str.length())); //StringIndexOutOfBoundsException

        //System.out.println(str.substring(str.length())); // hiclik

    }
}
