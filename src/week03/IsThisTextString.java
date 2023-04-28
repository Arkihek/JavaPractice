package week03;

import java.util.Scanner;

public class IsThisTextString {

    // Kullanicidan alinan karakterlerin String olup olmadigini kontrol eden bir java program yaziniz

    static Scanner scan = new Scanner(System.in);

    public static void IsthisString(){
        System.out.println("Please input a string text...");
        // Kullanici int bir giris yapabilir ==> kontrol etmemiz gerek
        if (scan.hasNextInt()){ // scan.hasNextInt == Kullanici int girerse true dondurecek. Degilse false
            int input = scan.nextInt();
            System.out.println("This is an integer input : " + input);
            IsthisString(); // method call yaptik
        } else if (scan.hasNextDouble()) {
            double doubleInput = scan.nextDouble();
            System.out.println("This is a double input : " + doubleInput);
            IsthisString();
        } else if (scan.hasNext()) {
            String strInput = scan.next();
            System.out.println("Great this is a string input...");
        }

    }

    /*
        Kullanici karisik string ve int girerse nasil string icerisinde int oldugu check edilebilir??
        for dongusu ile herbir karaktere bakilarak int olup olmadigi kontrol edilebilir....
     */

    public static void main(String[] args) {
        IsthisString();
    }


}
