package week03;

import java.util.Scanner;

public class BankOfSlovenia {

    /*
Bir Java ATM programi yaziniz asagidaki kurallara gore;
1-Kullaniciyi karsilayan bir method yazin ve yapmak istedigi islemleri sorun
2-Kullanici Bakiyesini ggorebilmesi icin method yaziniz
3-Kullanici Deposito yatirabilsin
4-Kullanici Para cekebilsin
5-Kullanici Cikis yapsin
 */

    static Scanner scan = new Scanner(System.in);
    static double balance = 5000;
    static double deposit;
    static int withdrawAmount;
    static int numberOfTransaction;

    public static void welcomeToBank() {
        System.out.println("****** WELCOME TO THE BANK OF SLOVENIA ******");
        System.out.println("Please Select Your Transaction");
        System.out.println("1-Balance\n2-Deposite\n3-Withdraw\n4-Exit");
        numberOfTransaction = scan.nextInt();
        if (numberOfTransaction >= 5 || numberOfTransaction < 1) {
            System.out.println("Wrong input...");
            welcomeToBank(); // Kullanici hatali giris yaptiginda tekrar basa donmesi ve giris yapmasi icin method call yaptik
        }
    }

    //Kullanicinin bakiyesinin ogrenebilmesi icin balanceLearning() methodu create ettik
    public static void balanceLearning() {
        System.out.println("Your Balance is : " + balance);
        welcomeToBank();
    }

    // Kullanicinin hesabina para yatirmasi icin depositAmount() methodu create ettik
    public static void depositAmount() {
        System.out.println("Please enter the deposit amount");
        deposit = scan.nextDouble();
        balance += deposit;
        System.out.println("Your balance is : " + balance);
    }

    public static void withdrawAmount() {
        System.out.println("Please enter the withdraw amount");
        withdrawAmount = scan.nextInt();

        if (withdrawAmount>balance || withdrawAmount>2500){
            System.out.println("Not possible transaction");
            withdrawAmount();
          //  return; // baska bir condition olmadigi icin kodun burada durmasini ve devam etmemesini istiyoruz.
            // Bu sebepten return; key kullanabiliriz. Return key basa dondermiyor sadece kodun o satirda durmasini sagliyor
            // method call yaptik return`e gerek kalmadi, kullanilmayabilir.
        }

        balance -= withdrawAmount;
        System.out.println("Your balance is : " + balance);
    }

    public static void exit() {
        System.out.println("Thank you for choosing us");
    }

    public static void transcation() {
        welcomeToBank();
        switch (numberOfTransaction) {
            case 1:
                balanceLearning();
                break;
            case 2:
                depositAmount();
                break;
            case 3:
                withdrawAmount();
                break;
            case 4:
                exit();
                break;
        }
    }

    public static void main(String[] args) {
        transcation();
    }

}
