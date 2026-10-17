
package Array;
public class ProdukUMKM {
    public static void main(String[] args) {
        double[] harga = {15000, 25000, 12000, 30000, 45000};

        double total = 0;
        double tertinggi = harga[0];
        double terendah = harga[0];

        System.out.println("=== DAFTAR HARGA BARANG ===");

        for (int i = 0; i < harga.length; i++) {

            double hargaAkhir = harga[i];

            // Aturan diskon 10% untuk harga minimal Rp30.000
            if (harga[i] >= 30000) {
                hargaAkhir = harga[i] - (harga[i] * 0.10);
            }

            System.out.printf("Barang ke-%d: Rp%.0f", i + 1, harga[i]);

            if (harga[i] >= 30000) {
                System.out.printf(" (Diskon 10%%, harga akhir: Rp%.0f)",
                        hargaAkhir);
            }

            System.out.println();

            // Menghitung total harga setelah diskon
            total += hargaAkhir;

            // Mencari harga tertinggi
            if (harga[i] > tertinggi) {
                tertinggi = harga[i];
            }

            // Mencari harga terendah
            if (harga[i] < terendah) {
                terendah = harga[i];
            }
        }

        // Menghitung rata-rata harga awal
        double totalAwal = 0;

        for (int i = 0; i < harga.length; i++) {
            totalAwal += harga[i];
        }

        double rataRata = totalAwal / harga.length;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.printf("Total harga awal: Rp%.0f%n", totalAwal);
        System.out.printf("Total setelah diskon: Rp%.0f%n", total);
        System.out.printf("Rata-rata harga: Rp%.0f%n", rataRata);
        System.out.printf("Harga tertinggi: Rp%.0f%n", tertinggi);
        System.out.printf("Harga terendah: Rp%.0f%n", terendah);
    }
}
