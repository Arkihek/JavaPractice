package week05;

import java.util.Scanner;

public class Q01_bolmeOperatoruOlmadanBolme {
    /*
    // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int bolunen = scan.nextInt();

        System.out.print("Lutfen bolen sayiyi giriniz : ");
        int bolen = scan.nextInt();

        bol(bolunen, bolen); // Cikarma islemi yaparak bolme yapicaz*

    }

    public static void bol(int bolunen, int bolen) {
        int bolum = 0; // bolumu dongunun icerisinde saymasi icin her seferinde artacak bir sayac olusturdum

        while (bolunen >= bolen) {
            bolunen -= bolen;
            bolum++;
        }
        System.out.println("Boldugunuz sayinin bolumu : " + bolum + "\nKalan ise : " + bolunen);
    }

}
