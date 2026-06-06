package bagian3.perpustakaan;

public class Buku {
    private final String judul;
    private final String penulis;
    private boolean dipinjam;
    private final int tahunTerbit;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void pinjamBuku() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
        } else {
            System.out.println("Buku sedang dipinjam.");
        }
    }

    public void kembalikanBuku() {
        dipinjam = false;
    }

    public void info() {
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Status       : " +
                (dipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println("---------------------------");
    }
}