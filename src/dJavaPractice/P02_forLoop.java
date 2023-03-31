package dJavaPractice;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {
        /*
                Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
                dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
                baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir baslangic degeri giriniz: ");
        int baslangicDegeri= scan.nextInt();

        System.out.println("Bir bitis degeri giriniz: ");
        int bitisDegeri= scan.nextInt();
        int toplam=0;
        if (bitisDegeri<baslangicDegeri){
            System.err.println("===   Baslangıc degeri bitis degerinden kücük olmalıdır     ====");}
        else

            for (int i = baslangicDegeri; i <=bitisDegeri ; i++) {
                toplam+=i;

        }
        System.out.println("Girilen degerler arasindaki sayilar toplamı: "+toplam);






    }
}
