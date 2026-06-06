package bagian2.arraylist;


import java.util.ArrayList;

public class LatihanMandiriArrayList {
     public static void main(String[] args) {

        // =========================
        // Soal 1
        // =========================
        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        // Hapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);

        System.out.println("=== Soal 1 ===");
        System.out.println("Isi daftar belanja:");
        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }
        System.out.println("Jumlah item akhir: " + daftarBelanja.size());


        // =========================
        // Soal 2
        // =========================
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(12);
        angka.add(45);
        angka.add(8);
        angka.add(67);
        angka.add(23);

        int terbesar = angka.get(0);

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesar = nilai;
            }
        }

        System.out.println("\n=== Soal 2 ===");
        System.out.println("Nilai terbesar: " + terbesar);


        // =========================
        // Soal 3
        // =========================
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Aisyah");
        nama.add("Citra");
        nama.add("Agus");
        nama.add("Dina");

        System.out.println("\n=== Soal 3 ===");
        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
