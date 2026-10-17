
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
import java.util.Scanner;

public class Absensi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int jumlahHadir = 0;
        int jumlahTidakHadir = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print(
                "Masukkan kehadiran mahasiswa ke-" + i
                + " (1 = Hadir, 0 = Tidak Hadir): "
            );
            int kehadiran = input.nextInt();

            if (kehadiran == 1) {
                jumlahHadir++;
            } else if (kehadiran == 0) {
                jumlahTidakHadir++;
            } else {
                System.out.println("Input tidak valid. Masukkan 1 atau 0.");
                i--; // Ulangi input untuk mahasiswa ini
            }
        }

        System.out.println("\nJumlah hadir: " + jumlahHadir);
        System.out.println("Jumlah tidak hadir: " + jumlahTidakHadir);

        if (jumlahMahasiswa > 0) {
            double persentase = (double) jumlahHadir / jumlahMahasiswa * 100;
            System.out.println("Persentase kehadiran: " + persentase + "%");

            if (persentase >= 75) {
                System.out.println("Memenuhi syarat");
            } else {
                System.out.println("Tidak memenuhi syarat");
            }
        } else {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
        }

        input.close();
    }
}