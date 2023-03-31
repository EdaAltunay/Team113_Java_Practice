package bProjePractice;

import java.util.ArrayList;
import java.util.Scanner;

public class C05_desimal {
    // Girilen desimal degeri binary degere ceviren metodu olusturunuz.
    // örn: 12= 1 1 0 0


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Desimal deger giriniz: ");
        int sayi = scan.nextInt();
        System.out.println(sayi + " desimal degerin binary karsılıgı " + binaryDonusum(sayi));

    }

    private static ArrayList<Integer> binaryDonusum(int sayi) {
        ArrayList<Integer> binary = new ArrayList<>();
        while (sayi >= 1) {
            binary.add(sayi % 2);
            sayi /= 2;
        }
        ArrayList<Integer> tersList = new ArrayList<>();
        for (int i = binary.size()-1 ; i >= 0; i--) {
            tersList.add(binary.get(i));

        }
        return tersList;

    }
}
