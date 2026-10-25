
package MateriMethod;
import java.util.Scanner;
public class PengembanganStudiKasus {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=== PROGRAM PENDATAAN MAHASISWA===");
        int jumlahProdi = inputUkuran("Masukkan jumlah Program Studi: ");
        int jumlahKelas = inputUkuran("Masukkan jumlah Kelas per Prodi: ");
        int jumlahMahaSiswa   = inputUkuran("Masukkan jumlah Mahasiswa per Kelas: ");
        String[] daftarProdi = new String[jumlahProdi];
        String[][][] dataMahasiswa = new String[jumlahProdi][jumlahKelas][jumlahMahaSiswa];
        inputDataMahasiswa(daftarProdi, dataMahasiswa);
        tampilkanDataMahasiswa(daftarProdi, dataMahasiswa);
        jalankanOperasiString(daftarProdi, dataMahasiswa);
        scanner.close();
    }
    public static int inputUkuran(String pesan) {
        System.out.print(pesan);
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Input harus berupa angka!");
            System.out.print(pesan);
            scanner.next();
        }
        int nilai = scanner.nextInt();
        scanner.nextLine();
        return nilai;
    }
    public static void inputDataMahasiswa(String[] namaProdi, String[][][] data) {
        System.out.println("\n---------------------------------");
        System.out.println("       INPUT DATA MAHASISWA      ");
        System.out.println("---------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.print("\nMasukkan Nama Program Studi ke-" + (i + 1) + ": ");
            namaProdi[i] = scanner.nextLine();

            for (int j = 0; j < data[i].length; j++) {
                System.out.println("  [ Kelas " + (j + 1) + " ]");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print("    - Nama Mahasiswa ke-" + (k + 1) + ": ");
                    data[i][j][k] = scanner.nextLine();
                }
            }
        }
    }
    public static void tampilkanDataMahasiswa(String[] namaProdi, String[][][] data) {
        System.out.println("\n=================================");
        System.out.println("     HASIL REKAPITULASI DATA     ");
        System.out.println("=================================");

        for (int i = 0; i < data.length; i++) {
            System.out.println("\nProgram Studi: " + namaProdi[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("  Kelas " + (j + 1) + ":");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.println("    " + (k + 1) + ". " + data[i][j][k]);
                }
            }
        }
    }
    public static void jalankanOperasiString(String[] namaProdi, String[][][] data) {
        System.out.println("\n=================================");
        System.out.println("      DEMO OPERASI STRING        ");
        System.out.println("=================================");
        System.out.println("\nFormatting Nama Ke Huruf Kapital :");
        for (int i = 0; i < data.length; i++) {
            System.out.println("   PRODI: " + namaProdi[i].toUpperCase());
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.println("     - " + data[i][j][k].toUpperCase());
                }
            }
        }
    }
}