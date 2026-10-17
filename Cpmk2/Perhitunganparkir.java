
package Cpmk2;
import java.util.Scanner;
public class Perhitunganparkir {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Input jenis kendaraan
        System.out.print("MasuScannScannererkkan jenis kendaraan (Motor/Mobil): ");
        String jenis = input.nextLine();

        // Input lama parkir
        System.out.print("Masukkan lama parkir (jam): ");
        int lamaParkir = input.nextInt();

        int tarifAwal;
        int tarifTambahan;
        int totalBiaya;

        // Menentukan tarif berdasarkan jenis kendaraan
        if (jenis.equalsIgnoreCase("Motor")) {
            tarifAwal = 2000;
            tarifTambahan = 1000;
        } else if (jenis.equalsIgnoreCase("Mobil")) {
            tarifAwal = 5000;
            tarifTambahan = 2000;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            input.close();
            return;
        }

        // Menghitung total biaya
        if (lamaParkir <= 1) {
            totalBiaya = tarifAwal;
        } else {
            totalBiaya = tarifAwal + 
                         (lamaParkir - 1) * tarifTambahan;
        }

        // Menampilkan hasil
        System.out.println("\n=== HASIL PARKIR ===");
        System.out.println("Jenis kendaraan : " + jenis);
        System.out.println("Lama parkir     : " + lamaParkir + " jam");
        System.out.println("Total biaya     : Rp " + totalBiaya);

        input.close();
    }
}
