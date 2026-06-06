
package bagian3.perpustakaan;


public class MainPerpustakaan {
    public static void main(String[] args) {

        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku = new Buku(
                "Pemrograman Java",
                "Andi Setiawan",
                2022);

        Buku buku2 = new Buku(
                "Basis Data",
                "Budi Santoso",
                2021);

        Buku buku3 = new Buku(
                "Struktur Data",
                "Andi Setiawan",
                2023);

        perpustakaan.tambahBuku(buku);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan semua buku
        perpustakaan.tampilkanSemuaBuku();

        // Meminjam buku
        perpustakaan.pinjamBuku("Pemrograman Java");

        // Menampilkan setelah dipinjam
        perpustakaan.tampilkanSemuaBuku();

        // Mengembalikan buku
        perpustakaan.kembalikanBuku("Pemrograman Java");

        // Menampilkan setelah dikembalikan
        perpustakaan.tampilkanSemuaBuku();

        // Cari buku berdasarkan penulis
        perpustakaan.cariPenulis("Andi Setiawan");
    }
}
