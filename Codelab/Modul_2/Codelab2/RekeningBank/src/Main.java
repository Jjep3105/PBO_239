class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Constructor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    // Metode untuk menyetor uang ke saldo
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    // Metode untuk menarik uang dari saldo
    public void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }
}

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1 dan rekening2
        RekeningBank rekening1 = new RekeningBank("202410370110239", "Savero", 890000);
        RekeningBank rekening2 = new RekeningBank("202410370110238", "Fasha", 970000);

        // Menampilkan informasi awal
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Transaksi setor uang
        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        // Transaksi tarik uang
        rekening1.tarikUang(800000); // Gagal karena saldo tidak mencukupi
        rekening2.tarikUang(300000); // Berhasil

        // Menampilkan informasi akhir
        System.out.println();
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
}
}