package Tugas;

/**
 *
 * @author user
 */
public class Mahasiswa {

    // Atribut data mahasiswa
    private String nama;
    private String npm;
    private double nilai;

    // Constructor untuk menginisialisasi objek Mahasiswa
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk mengambil data dari luar class
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method untuk mengecek kelulusan (nilai >= 60)
    public boolean lulus() {
        return this.nilai >= 60;
    }
}