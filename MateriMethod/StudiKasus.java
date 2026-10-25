
package MateriMethod;
public class StudiKasus {
   public static void main(String[] args) {
        // Deklarasi array 3D: [3 Prodi][3 Kelas][5 Mahasiswa]
        String[][][] dataMahasiswa = {
            {
                {"Amry", "Dzaky", "krisna", "Bintang", "Arif"},      // Kelas A
                {"Nabil", "Zakaz", "Aldy", "Alfan", "Naufal"},    // Kelas B
                {"Revy", "Rafly", "Usman", "Saiful", "Rafael"}  // Kelas C
            },
            {
                {"Revy", "Rafly", "Usman", "Saiful", "Rafael"},     // Kelas A
                {"Amry", "Dzaky", "krisna", "Bintang", "Arif"},   // Kelas B
                {"Nabil", "Zakaz", "Aldy", "Alfan", "Naufal"}    // Kelas C
            },
            {
                {"Nabil", "Zakaz", "Aldy", "Alfan", "Naufal"},   // Kelas A
                {"Revy", "Rafly", "Usman", "Saiful", "Rafael"},   // Kelas B
                {"Amry", "Dzaky", "krisna", "Bintang", "Arif"}// Kelas C
            }
        };
        String[] namaProdi = {"Teknik Informatika", "Sistem Informasi", "Manajemen"};
        String[] namaKelas = {"Kelas A", "Kelas B", "Kelas C"};

        // Menampilkan data mahasiswa menggunakan nested loop
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("==========================================");
            System.out.println("PROGRAM STUDI: " + namaProdi[i]);
            System.out.println("==========================================");
            
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                System.out.println("\n  " + namaKelas[j] + ":");
                
                for (int k = 0; k < dataMahasiswa[i][j].length; k++) {
                    System.out.println("    " + (k + 1) + ". " + dataMahasiswa[i][j][k]);
                }
            }
            System.out.println();
        }
    }
} 