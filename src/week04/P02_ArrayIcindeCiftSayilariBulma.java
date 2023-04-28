package week04;

import java.util.ArrayList;
import java.util.List;

public class P02_ArrayIcindeCiftSayilariBulma {
    /*
    iki string array icerisindeki ayni elemanlari bulan bir java methodu create ediniz
    */

    public static void ortakEleman() {
        // Verilen iki array`i karsilastirmak icin size`larinin ayni olmasi gerekiyor veya
        // size`i kucuk olana gore karsilastirmak gerekiyor.
        String[] data = {"Java", "SQL", "HTML", "Selenium", "API", "Python", "Postman", "devops"};
        String[] data2 = {"Java", "SQL", "html", "selenium", "Api", "C#", "SoapUI", "azure"};
        // karsilastirdigim elemanlari bir Array icerisine atayamayiz cunku
        // ayni olan kac eleman var bilmiyoruz. Array size belli degil.
        // Bu sebepten list olusturmak mantikli

        List<String> ortakElemanlarListesi = new ArrayList<>();

        // inner for loop ile array`lerin icerisine girip her bir datayi digerleri ile karsilastiralim
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data2.length; j++) {
                if (data[i].equalsIgnoreCase(data2[j])){
                    ortakElemanlarListesi.add(data[i]);
                }
            }
        }
        System.out.println(ortakElemanlarListesi);
    }

    public static void main(String[] args) {
        ortakEleman();
    }
}
