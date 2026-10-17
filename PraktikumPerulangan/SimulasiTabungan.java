
package PraktikumPerulangan;

/**
 ACHMAD NABIL FIRDAUZ
 NIM : 09020626040
 */
import java.util.Scanner;

public class SimulasiTabungan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();

        int tabunganBulanan = 100_000;
        int totalTabungan = 0;
        int bulanMencapaiTarget = 0;

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            System.out.println("Bulan " + bulan + ": Rp" + tabunganBulanan);

            totalTabungan += tabunganBulanan;

            if (totalTabungan >= 1_000_000) {
                bulanMencapaiTarget = bulan;
                break;
            }

            tabunganBulanan += 50_000;
        }

        System.out.println("Total tabungan: Rp" + totalTabungan);

        if (bulanMencapaiTarget > 0) {
            System.out.println("Target pertama kali tercapai pada bulan ke-" + bulanMencapaiTarget);
        } else {
            System.out.println("Target Rp1.000.000 belum tercapai dalam jumlah bulan tersebut.");
        }

        input.close();
    }
}