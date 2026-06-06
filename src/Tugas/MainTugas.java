package Tugas;

// Nama: Elyza Nurfarina Rizkia Maulida
// NPM: 2410010431
public class MainTugas {
    public static void main(String[] args) {
        // 4. Menyimpan dan menampilkan daftar mata kuliah menggunakan Array String
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Basis Data", "Struktur Data"};
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Membuat objek pengelola kelas kuliah
        KelasKuliah kelas = new KelasKuliah();

        // 3. Menambahkan minimal 5 objek Mahasiswa awal ke koleksi
        kelas.tambahMahasiswa(new Mahasiswa("Andi Saputra", "2024001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Utomo", "2024002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Dewi", "2024003", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Deni Dermawan", "2024004", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Rahma", "2024005", 90.0));

        // Menampilkan data mahasiswa awal
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();

        // 5. Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println("Total Data Mahasiswa  : " + kelas.getJumlahMahasiswa());
        System.out.println();

        // 6. Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println("... Menambahkan 1 mahasiswa baru ...");
        kelas.tambahMahasiswa(new Mahasiswa("Fahmi Idris", "2024006", 65.0));
        System.out.println();

        // Menampilkan kembali data dan jumlah data terbaru
        System.out.println("=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        System.out.println("Jumlah Data Terbaru   : " + kelas.getJumlahMahasiswa() + " mahasiswa.");
        System.out.printf("Rata-rata Nilai Baru  : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Lulus Terbaru  : " + kelas.jumlahLulus());
    }
}