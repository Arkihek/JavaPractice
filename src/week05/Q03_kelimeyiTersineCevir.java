package week05;

import java.util.Scanner;

public class Q03_kelimeyiTersineCevir {
    // Soru- Kullanicidan bir cumle veya bir kelime girmisini isteyip
    // girilen degeri tersine yazdiran bir method olusturun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle yada kelime giriniz : ");

        String kelime = scan.nextLine();

        tersineCevir(kelime);
    }

    public static void tersineCevir(String str){

        String temp = "";

        for (int i = str.length()-1; i >= 0; i--) {
            temp += str.charAt(i);
        }

        System.out.println(temp);
    }


}
