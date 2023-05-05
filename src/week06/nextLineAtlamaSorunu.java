package week06;

import java.util.Scanner;

public class nextLineAtlamaSorunu {

    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String name = mb.nextLine();

        System.out.print("Lutfen yasinizi giriniz : ");
        int age = mb.nextInt();

        // satir sonu arabellekte kalan bosluk kullanilmalidir. Bunun icin bos bir nextLine kullanarak sorun cozulur.
        mb.nextLine(); // dumy

        System.out.print("Lutfen mesleginizi giriniz : ");
        String job = mb.nextLine();

        mb.close();

    }

}
