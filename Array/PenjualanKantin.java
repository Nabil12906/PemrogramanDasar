
package Array;
public class PenjualanKantin {
    public static void main(String[] args) {
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};

        int total = 0;
        int tertinggi = penjualan[0];
        int terendah = penjualan[0];
        int jumlahHari = 0;

        // Menghitung data penjualan
        for (int i = 0; i < penjualan.length; i++) {
            total += penjualan[i];

            if (penjualan[i] > tertinggi) {
                tertinggi = penjualan[i];
            }

            if (penjualan[i] < terendah) {
                terendah = penjualan[i];
            }

            if (penjualan[i] >= 30) {
                jumlahHari++;
            }
        }

        // Menghitung rata-rata
        double rataRata = (double) total / penjualan.length;

        // Menampilkan hasil
        System.out.println("Total penjualan: " + total);
        System.out.println("Rata-rata penjualan: " + rataRata);
        System.out.println("Penjualan tertinggi: " + tertinggi);
        System.out.println("Penjualan terendah: " + terendah);
        System.out.println("Jumlah hari dengan penjualan minimal 30: " + jumlahHari);
    }
}
