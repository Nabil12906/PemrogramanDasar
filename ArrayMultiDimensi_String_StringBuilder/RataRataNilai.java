package ArrayMultiDimensi_String_StringBuilder;
public class RataRataNilai {
    public static void main(String[] args) {
        // Mendeklarasikan array 2D untuk menyimpan nilai 3 mahasiswa pada 4 mata kuliah
        // Baris mewakili mahasiswa, kolom mewakili mata kuliah
        int[][] nilai = {
            {80, 85, 90, 88}, // Nilai Mahasiswa 1
            {75, 70, 85, 90}, // Nilai Mahasiswa 2
            {90, 95, 92, 89}  // Nilai Mahasiswa 3
        };

        System.out.println("--- Hasil Rata-rata Nilai ---");

        // Perulangan luar (i) untuk setiap mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            double total = 0; 
            
            // Perulangan dalam (j) untuk setiap mata kuliah yang diambil mahasiswa tersebut
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            
            // Menghitung rata-rata (total nilai dibagi jumlah mata kuliah)
            double rataRata = total / nilai[i].length;
            
            // Menampilkan hasil
            System.out.println("Rata-rata Mahasiswa " + (i + 1) + ": " + rataRata);
        }
    }
}
    