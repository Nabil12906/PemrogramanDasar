
package Cpmk2;
import java.util.Scanner;
import java.util.Random;
public class Tebakangka {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Komputer memilih angka acak 1-100
        int angkaRahasia = random.nextInt(100) + 1;

        int tebakan;
        int percobaan = 0;
        boolean benar = false;

        System.out.println("=== GAME TEBAK ANGKA ===");
        System.out.println("Komputer telah memilih angka dari 1 sampai 100.");
        System.out.println("Kamu memiliki maksimal 7 percobaan.");
        System.out.println();

        // Maksimal 7 percobaan
        while (percobaan < 7) {

            System.out.print("Percobaan ke-" + (percobaan + 1) + ", masukkan tebakan: ");
            tebakan = input.nextInt();

            percobaan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");
            } 
            else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } 
            else {
                System.out.println("Benar!");
                System.out.println("Selamat! Kamu berhasil menebak angka "
                        + angkaRahasia + ".");
                System.out.println("Jumlah percobaan: " + percobaan);
                
                benar = true;
                break;
            }

            System.out.println();
        }

        // Jika sudah 7 percobaan tetapi belum benar
        if (!benar) {
            System.out.println();
            System.out.println("Maaf, kesempatan kamu sudah habis.");
            System.out.println("Angka yang benar adalah: " + angkaRahasia);
            System.out.println("Jumlah percobaan: " + percobaan);
        }

        input.close();
    }
}
