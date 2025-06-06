package stringManipulations;

public class C15_nullPointer {

    public static void main(String[] args) {

        /*

        Java, non-primitive bir variable'i hem deger atamayip
        hem de yazdirabilmemiz icin null-pointer'i olusturmustur.

         */

        String isim1= null;
        String isim2;
        String isim3= "";

        // isim3'e bir deger atanmistir
        // bu deger yazdirilabilir veya methodlarla kullanilabilir

        System.out.println(isim3);  //hiclik

        System.out.println(isim3.length()); //0

        // isim1 ve isim2'ye ise deger atanmamistir
        // isim1 null pointer ile isaretlendiginden,
        // java bunun kullanim sorumlulugunu bize birakir

       // System.out.println(isim1);

       // System.out.println(isim1.length());

        // isim2'yi ise deger atanmadigi surece kullanmamiza izin vermez

       // System.out.println(isim2);
    }
}
