// Superclass KarakterGame
class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {
        // Akan dioverride oleh subclass
    }
}

// Subclass Pahlawan
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan api!");
        target.setKesehatan(target.getKesehatan() - 79);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Subclass Musuh
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan drone");
        target.setKesehatan(target.getKesehatan() - 134);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan Phoenix = new Pahlawan("Phoenix", 150);
        Musuh Cypher = new Musuh("Cypher", 150);

        // Menampilkan status awal
        System.out.println("Status awal:");
        System.out.println(Phoenix.getNama() + " memiliki kesehatan: " + Phoenix.getKesehatan());
        System.out.println(Cypher.getNama() + " memiliki kesehatan: " + Cypher.getKesehatan());

        // Simulasi pertarungan
        Phoenix.serang(Cypher);
        Cypher.serang(Phoenix);
    }
}
