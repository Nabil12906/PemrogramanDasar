
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
public class PiramidaBintang {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // Cetak spasi sebelum bintang
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Cetak bintang: 1, 3, 5, 7, 9
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
