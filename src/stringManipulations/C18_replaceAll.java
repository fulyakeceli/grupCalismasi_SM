package stringManipulations;

public class C18_replaceAll {

    public static void main(String[] args) {

        /*

        replace()'den farkli olarak tek tek
        metinleri degistirmek yerine
        parametre olarak girilen regex'in kapsadigi
        tum karakterleri degistirir.

         */

       String str = "J1a2v3a4";
        System.out.println(str);

       // tum rakamlardan kurtulmak icin:

        str= str.replaceAll("\\d", "");
        System.out.println(str);

        // bosluklardan kurtulmak istersek:

        String str1 = "Java       guzeldir";

        System.out.println(str1.replaceAll("\\s",""));






    }
}
