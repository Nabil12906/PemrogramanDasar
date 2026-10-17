
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
public class SegitigaKanan {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // Cetak spasi sebelum bintang
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Cetak bintang
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
