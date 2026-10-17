
package Praktikum;
import java.util.Scanner;
/**Identitas diri
 * Achmad Nabil Firdauz
 * NIM : 09020626040
 * Modul Praktikum Bab 4
 */
public class Bab4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("IPK : ");
        double ipk = input.nextDouble();

        System.out.print("Hafalan (juz) : ");
        int hafalan = input.nextInt();

        if (ipk >= 3.25 && hafalan >= 5) {
            System.out.println("Memenuhi syarat beasiswa.");
        } else {
            System.out.println("Belum memenuhi syarat beasiswa.");
        }
        input.close();
    }
}
