
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
import java.util.Scanner;

public class Faktorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println(n + "! = " + hasil);

        input.close();
    }
}
