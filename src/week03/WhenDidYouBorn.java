package week03;

import java.util.Scanner;

public class WhenDidYouBorn {

    // Kullaniciya hangi ayda dogdugunu sorun ve
    // Dogdugu ayin hangi mevsim oldugunu yazan bir java program yaziniz


    static Scanner scan = new Scanner(System.in);
    static String mounth;
    static String season= null;
    static String january = "january";
    static String february = "february";
    static String march = "march";
    static String april = "april";
    static String may = "may";
    static String june = "june";
    static String july = "july";
    static String august = "august";
    static String september = "september";
    static String october = "october";
    static String november = "november";
    static String december = "december";

    public static void birthDay(){
        System.out.println("Please enter the mounth you born in");
        mounth=scan.next();
        if (mounth.equalsIgnoreCase(january) || mounth.equalsIgnoreCase(february) || mounth.equalsIgnoreCase(december)){
            season = "Winter";
        } else if (mounth.equalsIgnoreCase(march) || mounth.equalsIgnoreCase(april) || mounth.equalsIgnoreCase(may)) {
            season = "Spring";
        } else if (mounth.equalsIgnoreCase(june) || mounth.equalsIgnoreCase(july) || mounth.equalsIgnoreCase(august)) {
            season = "Summer";
        } else if (mounth.equalsIgnoreCase(september) || mounth.equalsIgnoreCase(october) || mounth.equalsIgnoreCase(november)) {
            season = "Autumn";
        }else {
            System.out.println("Invalid Input...");
            birthDay(); // method call
        }
        System.out.println("Your were born in :" + season);

    }

    public static void main(String[] args) {
        birthDay();
    }



}
