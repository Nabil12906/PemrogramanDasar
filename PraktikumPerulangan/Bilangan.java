
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
import java.util.Scanner;

public class Bilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        System.out.println("Bilangan 1 sampai " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nBilangan genap:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nBilangan ganjil:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
