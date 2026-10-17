
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
import java.util.Scanner;

public class PolaDinamis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            // Spasi di depan bintang
            for (int spasi = tinggi - i; spasi > 0; spasi--) {
                System.out.print(" ");
            }

            // Bintang: 1, 3, 5, dan seterusnya
            for (int bintang = 1; bintang <= 2 * i - 1; bintang++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}
