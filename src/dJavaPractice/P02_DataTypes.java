package dJavaPractice;

public class P02_DataTypes {
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
        char   :tek tirnak icinde tek karakter.Ve tirnak icinde olmadan sayi(ASCII)
        */

        byte b1= Byte.MAX_VALUE;
        System.out.println("b1 ="+b1);

        short s1 = Short.MAX_VALUE;
        System.out.println("s1 = " + s1);

        int i1=Integer.MIN_VALUE;
        System.out.println("i1 ="+i1);

        long l1=Long.MIN_VALUE;
        System.out.println("l1 = "+l1);



        float f1=Float.MAX_VALUE;
        System.out.println("f1 :"+f1);

        double d2=Double.MIN_VALUE;
        System.out.println("d2 = " + d2);

        boolean kod=true;
        System.out.println("kod doğru girildi mi = " + kod);

        char giris='m';
        System.out.println("giris = " + giris);
        /*
        *nonPrimitive - çok fazla vardır
        String şu ana kadar karşlaştığımız
        * Genel adı (babası) Object tir
        * Karakter sınırı yoktur.
         */
        String isim="Mustafa";
        System.out.println("isim = " + isim);
        System.out.println(isim.charAt(0));
        String sayi="1000";
        System.out.println((Integer.valueOf(sayi)+1991));
        ///////////7
        String sayi2="2000";
        int sayi3=Integer.valueOf(sayi2);
        System.out.println(sayi3 +2000 );


    }


    }

