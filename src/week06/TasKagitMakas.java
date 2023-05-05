package week06;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    // bilgiayara karsi tas kagit makas oyunu oynayalim
    // 5 puana kim ulasirsa onun kazandigini soylesin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int userChoice = 0;
        int compChoice = 0;
        int userPoint = 0;
        int compPoint = 0;

        do {
            System.out.println("Lutfen Secim yapiniz : \n" +
                    "1 - Tas\n" +
                    "2 - Kagit\n" +
                    "3 - Makas");
            // Kullanici secimi
            userChoice = scan.nextInt();

            // Computer secimi
            compChoice = rnd.nextInt(3) + 1; // 0 - 3 (0 dahil 3 dahil degil) arasi bir deger uretecegi icin +1 yaptik. 0 degerini almamasi icin +1 yaptik

            if (userChoice == 1 && compChoice==2){
                System.out.print("Bilgisayarin sectigi : " + compChoice);
                System.out.println();
                System.out.print("Kagit tasi sarar -- Bilgisayar Kazandi..");
                compPoint ++;
                System.out.print("\nSizin puaniniz : " + userPoint + "\nBilgisayarin puani : " + compPoint);
                System.out.println();
            } else if (userChoice==1 && compChoice==3) {
                System.out.print("Bilgisayarin sectigi : " + compChoice);
                System.out.println();
                System.out.print("Tas makasi kirar -- Kullanici Kazandi..");
                userPoint ++;
                System.out.print("\nSizin puaniniz : " + userPoint + "\nBilgisayarin puani : " + compPoint);
                System.out.println();
            } else if (userChoice==2 && compChoice==1) {
                System.out.print("Bilgisayarin sectigi : " + compChoice);
                System.out.println();
                System.out.print("Kagit tasi sarar -- Kullanici Kazandi..");
                userPoint ++;
                System.out.print("\nSizin puaniniz : " + userPoint + "\nBilgisayarin puani : " + compPoint);
                System.out.println();
            } else if (userChoice==2 &&compChoice==3) {
                System.out.print("Bilgisayarin sectigi : " + compChoice);
                System.out.println();
                System.out.print("Makas kagidi keser -- Bilgisayar Kazandi..");
                compPoint ++;
                System.out.print("\nSizin puaniniz : " + userPoint + "\nBilgisayarin puani : " + compPoint);
                System.out.println();
            } else if (userChoice==3 && compChoice==1) {
                System.out.print("Bilgisayarin sectigi : " + compChoice);
                System.out.println();
                System.out.print("Tas makasi kirar -- Bilgisayar Kazandi..");
                compPoint ++;
                System.out.print("\nSizin puaniniz : " + userPoint + "\nBilgisayarin puani : " + compPoint);
                System.out.println();
            } else if (userChoice == 3 && compChoice==2) {
                System.out.print("Bilgisayarin sectigi : " + compChoice);
                System.out.println();
                System.out.print("Makas kagidi keser -- Kullanici Kazandi..");
                userPoint ++;
                System.out.print("\nSizin puaniniz : " + userPoint + "\nBilgisayarin puani : " + compPoint);
                System.out.println();
            }else {
                System.out.print("Bilgisayarin sectigi : " + compChoice);
                System.out.println();
                System.out.println("Beraberlik oldu");
            }


        } while (userPoint != 5 && compPoint != 5);
        if (userPoint>compPoint){
            System.out.println("TEBRIKLER KAZANDINIZ");
        }else {
            System.out.println("MALESEF KAYBETTINIZ");
        }

    }

}
