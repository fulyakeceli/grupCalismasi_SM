package stringManipulations;

public class C08_Ornek {

    public static void main(String[] args) {


        String str = "Bugun bayram erken kalkin cocuklar";

        // String'in bastan ilk 5 harfini yazdirin
        System.out.println(str.substring(0,5)); //Bugun



        // String'in son karakterini yazdirin
        System.out.println(str.charAt(str.length()-1)); // r



        // String'in 3. index dahil 8inci index haric kadar olan kismini yazdirin

        System.out.println(str.substring(3,8)); // un ba


        // String'in bastan ikinci harfi ile sondan ikinci harfi dahil yazdirin

        System.out.println(str.substring(1,str.length()-1)); //ugun bayram erken kalkin cocukla





    }
}
