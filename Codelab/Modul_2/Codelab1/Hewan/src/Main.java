// Kelas Hewan
class Hewan {
    // Atribut
    String nama;
    String jenis;
    String suara;

    // Konstruktor
    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan
        Hewan hewan1 = new Hewan("Sapi", "Mamalia", "Moooo");
        Hewan hewan2 = new Hewan("Ayam", "Bertelur", "Kukuruyuk");

        // Memanggil metode tampilkanInfo()
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
}
}