package dJavaPractice;

public class P05_forLoop {
    public static void main(String[] args) {
        /*     verilen String'deki kullalanilan harfleri
               kelimeyi ve tekrarsiz halini yazdirip
               kelimede kullanilan farkli harf sayisini yazdırın
 */

        String input = "Have a nice day";
        String tekrarsizİnput = "";
        String islenecekKelime = input.replaceAll("\\W", "");
        System.out.println(islenecekKelime);    // Haveaniceday

        for (int i = 0; i <islenecekKelime.length() ; i++) {
            if (!tekrarsizİnput.contains(islenecekKelime.substring(i,i+1))){
                tekrarsizİnput+=islenecekKelime.substring(i,i+1);

            }

        }
        System.out.println("input: "+input);
        System.out.println("tekrarsiz input: "+tekrarsizİnput);
        System.out.println("tekrarsiz harf sayisi: "+tekrarsizİnput.length());


    }
}
