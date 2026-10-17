
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
public class Pola4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Cetak spasi di depan
            for (int spasi = 5; spasi > i; spasi--) {
                System.out.print(" ");
            }

            // Cetak bintang: 1, 3, 5, 7, 9
            for (int bintang = 1; bintang <= 2 * i - 1; bintang++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
