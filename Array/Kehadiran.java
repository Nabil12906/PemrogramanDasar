
package Array;
public class Kehadiran {
    public static void main(String[] args) {
        int[] hadir = {14, 13, 16, 12, 15, 10, 16, 14};
        int totalPertemuan = 16;

        for (int i = 0; i < hadir.length; i++) {

            double persentase = (double) hadir[i] / totalPertemuan * 100;

            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.printf("Jumlah hadir: %d pertemuan%n", hadir[i]);
            System.out.printf("Persentase kehadiran: %.2f%%%n", persentase);

            if (persentase >= 75) {
                System.out.println("Status: Memenuhi minimal 75%");
            } else {
                System.out.println("Status: Tidak memenuhi minimal 75%");
            }

            System.out.println("------------------------");
        }
    }
}
