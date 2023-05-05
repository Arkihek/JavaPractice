package week06;

public class oContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i == 3) {
                continue; // 3 `e gelince yazdirmadan devam et dedik
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.err.println("Islem tamam"); // err kirmizi yazdirir ciktiyi

    }
}
