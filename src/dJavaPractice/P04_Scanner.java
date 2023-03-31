package dJavaPractice;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {
        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
    *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi,soyadinizi,yasinizi,mail adresinizi ve sifrenizi her bir bilgi arasinda ENTER e basarak giriniz.");
        String name = scan.next();
        String surname = scan.next();
        int age = scan.nextInt();
        String mail = scan.next();
        String password = scan.next();

        System.out.println("*****       KAYIT BAŞARILI       *****" +
                "\n    Adınız: " + name+
                "\n    Soyadınız: " + surname +
                "\n    Yaşınız:" + age +
                "\n    Mail Adresiniz:" + mail +
                "\n    Şifreniz: " + password +
                "\n    şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");

    }
}