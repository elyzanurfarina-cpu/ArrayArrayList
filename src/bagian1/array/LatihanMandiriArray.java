package bagian1.array;


public class LatihanMandiriArray {
    public static void main(String[] args) {
 
        // ============================================================
        // No. 1 - Suhu tertinggi dan terendah
        // ============================================================
        System.out.println("=== No. 1 - Suhu Tertinggi dan Terendah ===");
 
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
 
        double max = suhu[0];
        double min = suhu[0];
 
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
 
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + " : " + suhu[i] + " C");
        }
        System.out.println("Suhu tertinggi : " + max + " C");
        System.out.println("Suhu terendah  : " + min + " C");
 
        // ============================================================
        // No. 2 - Nama hari yang memiliki lebih dari 5 huruf
        // ============================================================
        System.out.println("\n=== No. 2 - Nama Hari Lebih dari 5 Huruf ===");
 
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
 
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println(hari + " (" + hari.length() + " huruf)");
            }
        }
 
        // ============================================================
        // No. 3 - Hitung angka genap
        // ============================================================
        System.out.println("\n=== No. 3 - Hitung Angka Genap ===");
 
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
 
        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah angka genap: " + genap);
    }

}