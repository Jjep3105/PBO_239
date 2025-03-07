import java.util.Scanner;
import java.time.LocalDate;

public class UserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        scanner.close();

        int tahunSekarang = LocalDate.now().getYear();

        int umur = tahunSekarang - tahunLahir;

        String gender;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            gender = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            gender = "Perempuan";
        } else {
            gender = "Tidak diketahui";
        }

        System.out.println("\nData Diri:");
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Umur        : " + umur + " tahun");
    }
}
