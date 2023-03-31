package Practice;

public class P01_PrintFonksiyonu {
    public static void main(String[] args) {
          /*
         SORU - 1 : Konsola
        Hello World ve "Hello World"
        yazdırınız.
         */
        System.out.println("Hello world");
        System.out.println("\"Hello World\"");

        /*
         \n: bir alt satıra yazmaya baslar.
         \t: 1 TAB bosluk bırakır.
         \": " yazar.
         \': ' yazar.
         \\: \ yazar.


        SORU - 2 : Konsola
        "Hello  \
        'World' \/"
        yazdırınız
         */
        System.out.println("\"Hello\t\\\n'World'\t\\/\"" );
        System.out.println("\"Hello  \\\n\'World' \\/\"" );


        /* SORU 3 : Konsola
        Eda Altunay - Maths Teacher
         */
        String name="Eda";
        String surname="Altunay";
        String job="Maths Teacher";

        System.out.println(name+" "+surname+" "+" - "+job);
        System.out.println("=====KOD BASARIYLA TAMAMLANDI=====");

        System.out.println("37.satiri sadece print ile yazarsak println yapmazsak ne kadar cok print'li sout de yazdırsak yanyana yazar.");

        System.out.print(name+" "+surname+" "+" - "+job+"");
        System.out.println("");  // hiclik

        System.out.println("veya");

        System.out.print(name+" ");
        System.out.print(surname+" - ");
        System.out.print(job);
        System.out.print("");
        System.out.println("");  //  hiclik

        System.out.println("PRİNT İLE PRİNTLN FARKİ");
        System.out.println(name+" ");
        System.out.println(surname+" - ");
        System.out.println(job);
        System.out.println("=====KOD BASARIYLA TAMAMLANDI=====");











    }

}
