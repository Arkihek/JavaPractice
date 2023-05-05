package week06;

import java.sql.Array;
import java.util.Scanner;

public class AdamAsmaca {
    /*
        Bu programda, kelimeler adlı bir kelime listesi oluşturulacak.
        Ardından, bu listeden rastgele bir kelime seçmek için Math.random() fonksiyonu kullanılmıştır.
        Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
        kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
        Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
        Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] kelimeler = {"java","programlama","fonksiyon","yazilim","degisken","kodlama","selenium","sql"};
        String secilenKelime = kelimeler[(int)Math.random()*kelimeler.length]; // kelimeler[3]
        int kelimelenght = secilenKelime.length();
        System.out.println("Lutfen bir harf girip ENTER tusuna basiniz.");
        int can = 5;
        String[] tahminEdilenHarfler = new String[secilenKelime.length()];
        for (int i = 0; i < tahminEdilenHarfler.length; i++) {
            tahminEdilenHarfler[i] = "_";
        }

        while (can>0);
    }
}
