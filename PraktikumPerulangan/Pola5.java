
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
public class Pola5 {
    public static void main(String[] args) {
        // Bagian atas: 1, 3, 5, 7, 9 bintang
        for (int i = 1; i <= 5; i++) {
            for (int spasi = 5; spasi > i; spasi--) {
                System.out.print(" ");
            }
            for (int bintang = 1; bintang <= 2 * i - 1; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bagian bawah: 7, 5, 3, 1 bintang
        for (int i = 4; i >= 1; i--) {
            for (int spasi = 5; spasi > i; spasi--) {
                System.out.print(" ");
            }
            for (int bintang = 1; bintang <= 2 * i - 1; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
