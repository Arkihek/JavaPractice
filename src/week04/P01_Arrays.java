package week04;

import java.util.Scanner;

public class P01_Arrays {
    public static void main(String[] args) {
        // Bir array`in degerlerini gosteren bir java programi olusturun


        //printArrayMethod();
        arrayElemanlariToplami();

    }

    // Int bir array olusturalim
    // Bir array create etmek icin once data turunu ve size`ini tanimlamamiz gerekiyor

    static int size; // birden fazla array creat etmek istersek size`yi her yerde kullanabiliriz
    static Scanner scan = new Scanner(System.in); // birden fazla method icinde kullanicidan veri alabilmek ve tekrara dusmemek icin class level da olusturduk

    // Kullanici tarafindan create edilen bir array`i print almak icin method olusturalim.
    public static void printArrayMethod() {
        // oncelikle kullaniciya array`in size`inin ne olmasi gerektigini soralim
        System.out.println("Lutfen Array`in size ini belirtin...");
        size = scan.nextInt();
        // Kullanicidan aldigimiz size ile array`in size`ini olusturmus olduk
        int[] ogrencilerinYaslari = new int[size];

        // Simdi array icerisine veri eklemeliyiz
        System.out.println("Lutfen Ogrencilerin Yaslarini giriniz");
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". Veri");
            ogrencilerinYaslari[i] = scan.nextInt();
        }

        // Girilen array verilerinin print`ini almak icin bir for loop daha olusturmaliyiz

        System.out.println("Olusturulan Array icerisindeki verilerin ciktisi ...");
        for (int i = 0; i < size; i++) {
            System.out.print(ogrencilerinYaslari[i] + " ");
        }
    }
    /*
        Kullanicidan alinan size ile bir int array olusturun ve array icerisindeki elemanlarin toplamini
        veren bir java methodu yazin
    */

    public static void arrayElemanlariToplami() {
        System.out.println("Lutfen Array`in size`ini belirtin");
        size = scan.nextInt();
        int[] employeeSalary = new int[size];

        // Array`i create etmek icin for loop kullanalim
        for (int i = 0; i < size; i++) {
            System.out.println(1 + i + ". Calisan Maasi");
            employeeSalary[i]= scan.nextInt();
        }
        int toplam = 0;
        //Array icerisindeki verilerin toplami
        for (int i = 0; i < size; i++) {
        toplam += employeeSalary[i];
        }
        System.out.println("Calisanlarin Maaslari Toplami : " + toplam);

    }

}
