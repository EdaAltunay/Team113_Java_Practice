package dJavaPractice;

public class P03_Variable {
    public static void main(String[] args) {
          /*
        byte  :sadece tamsayi degeri alir. _8 bit
        short :sadece tamsayi degeri alir. _16 bit
        int   :sadece tamsayi degeri alir. _32 bit
        long  :sadece tamsayi degeri alir. _64 bit

        float  :ondalikli sayi degerleri alir.sonuna f,F zorunlu.
        double :ondalikli sayi degerleri alir.sonuna d koyulabilir.

        double>float>long>int>short>byte.
        boolean:true ya da false verir.

           */
        byte a2=126;
        int a4=127;
        long l1=222222222;
        float f1=2.34f;
        double d1=23.57;
        double d2=123546798520d;
        char ch1=102;
        char ch2='M';
        String str= "mustafa";

        System.out.println("ilk harf : "+str.charAt(0));
        System.out.println("isim = " + str.toUpperCase());
        System.out.println("ch1 : " +ch1 +"\n" +"ch2 : " +ch2);
        int sayi; // Değer atamadan oluşturulabilir ama kullanılamaz
        sayi=30;
        System.out.println("sayi = " + sayi);

    }
}
