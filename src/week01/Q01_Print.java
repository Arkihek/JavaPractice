package week01;

public class Q01_Print {

    public static void main(String[] args) {

        /*
    Konsolda :

    "Hello "\
    / 'World'"

    yazdiriniz.
    */
    /*
     \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
            \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
            \\  : Prints a back slash    : \  Ters slash yazdırır
            \'  : Prints single quote    : '  Tek tırnak yazdırır. ---- char ifadelerde yapmak zorundayiz. 35. kod
            \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */

        System.out.println("Hello World"); // Hello World

        System.out.println("\""); // "

        System.out.println("'''\'"); // ''''

        System.out.println("\"Hello \"\\\n/ 'World'\"");

        String afilliYazi = "\"Hello \"\\\n/ 'World'\"";

        System.out.println("afilliYazi = " + afilliYazi);

        char karakter = '\'';

        System.out.println(karakter); // '
    }
}
