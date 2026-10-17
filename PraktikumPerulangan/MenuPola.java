
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
import java.util.Scanner;

public class MenuPola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int tinggi = 5;

        do {
            System.out.println("\n===== MENU POLA =====");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: // Segitiga
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2: // Segitiga terbalik
                    for (int i = tinggi; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // Persegi
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= tinggi; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4: // Piramida
                    for (int i = 1; i <= tinggi; i++) {
                        for (int spasi = tinggi - i; spasi > 0; spasi--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5: // Diamond
                    // Bagian atas
                    for (int i = 1; i <= tinggi; i++) {
                        for (int spasi = tinggi - i; spasi > 0; spasi--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    // Bagian bawah
                    for (int i = tinggi - 1; i >= 1; i--) {
                        for (int spasi = tinggi - i; spasi > 0; spasi--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia. Silakan pilih 1 sampai 6.");
            }

        } while (pilihan != 6);

        input.close();
    }
}
