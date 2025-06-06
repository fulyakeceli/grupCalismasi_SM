package stringManipulations;

public class C11_endsWith {

    public static void main(String[] args) {

        /*

        Bir string'in baska bir string ile
        bitip bitmedigini kontrol eder

         */

        String str = "Java ogren, IT dunyasina katil";

        System.out.println(str.endsWith("l")); // true

         System.out.println(str.endsWith("katil")); // true

        System.out.println(str.endsWith("atil")); // true

        System.out.println(str.endsWith("IT dunyasina katil")); // true

        System.out.println(str.endsWith("katil ")); // false

         System.out.println(str.endsWith("Java ogren, IT dunyasina katil")); //true
    }
}
