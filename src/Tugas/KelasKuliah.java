package Tugas;

/**
 *
 * @author user
 */
import java.util.ArrayList;
public class KelasKuliah {
    // Menyimpan koleksi objek Mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method untuk menambahkan mahasiswa ke dalam list
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method untuk menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                hitung++;
            }
        }
        return hitung;
    }

    // Method untuk menampilkan semua data mahasiswa dalam kelas
    public void tampilkanSemua() {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s | %-12s | %-6s | %-10s\n", "Nama", "NPM", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-15s | %-12s | %-6.1f | %-10s\n", 
                mhs.getNama(), mhs.getNpm(), mhs.getNilai(), status);
        }
        System.out.println("--------------------------------------------------");
    }
    
    // Method tambahan untuk mendapatkan total data terbaru
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}