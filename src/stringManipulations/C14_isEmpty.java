package stringManipulations;

public class C14_isEmpty {

    public static void main(String[] args) {

        // Verilen String'in bos olup olmadigini boolean olarak dondurur

        String str1 = " ";
        String str2 = "";
        String str3 = " Fulya";

        System.out.println(str1.isEmpty()); // false

        System.out.println(str2.isEmpty()); // true

        /*

        Eger space kullanilmissa bize false dondurur
        Empty olmasi icin yalnizca hiclik kullanmamiz gerekir
         */

        System.out.println(str1.isBlank()); // true
        // blank'te space kullanilabilir

        System.out.println(str3.isBlank()); // false
        System.out.println(str3.isEmpty()); // false

    }
}
