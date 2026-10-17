
package Praktikum;
import java.util.Scanner;
/**Identitas diri
 * Achmad Nabil Firdauz
 * NIM : 09020626040
 * Modul Praktikum Bab 1
 
 */
public class Bab1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Frekuensi wudhu : ");
        int frekuensiWudhu = input.nextInt();
        System.out.print("Air per wudhu (liter) : ");
        double airPerWudhu = input.nextDouble();
        double totalAir =
        jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        System.out.println("\n=== HASIL ===");
        System.out.println("Total kebutuhan air = "
                + totalAir + " liter");
        input.close();
    }
}
