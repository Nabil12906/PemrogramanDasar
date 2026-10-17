
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap");
            System.out.println("3. Menghitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    for (int i = 2; i <= 20; i += 2) {
                        System.out.println(i);
                    }
                    break;

                case 3:
                    int jumlah = 0;
                    for (int i = 1; i <= 10; i++) {
                        jumlah += i;
                    }
                    System.out.println("Jumlah 1-10 = " + jumlah);
                    break;

                case 4:
                    System.out.print("Masukkan tinggi segitiga: ");
                    int tinggi = input.nextInt();

                    for (int baris = 1; baris <= tinggi; baris++) {
                        for (int kolom = 1; kolom <= baris; kolom++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (pilihan == 5) {
                break;
            }

        } while (true);

        input.close();
    }
}
