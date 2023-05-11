package week07;

public class P01_ArraydekiSayilariTopla {
    // Create an array of 5 floats and calculate theır sums

    public static void main(String[] args) {
        float[] numbers = {1.1f,2.2f,3.3f,4.4f,5.5f};

        float toplam = 0;

        for (int i = 0; i < numbers.length; i++) {
            toplam+=numbers[i];
        }

        System.out.println("Toplam for loop : " + toplam);

        System.out.println("********* While loop cozumu **********");

        toplam=0;
        int i = 0;

        while (i< numbers.length){
            toplam+=numbers[i];
            i++;
        }
        System.out.println("Toplam for loop : " + toplam);

        System.out.println("********* While loop 2. cozum **********");

        toplam=0;
        i = numbers.length-1;
        while (i>=0){
            toplam+=numbers[i];
            i--;
        }
        System.out.println("Toplam for loop : " + toplam);
    }
}
