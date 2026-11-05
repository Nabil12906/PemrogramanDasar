package ArrayMultiDimensi_String_StringBuilder;
public class KapitalHurufPertama {
    public static void main(String[] args) {
        // Kalimat asli dengan huruf kecil semua
        String kalimat = "belajar pemrograman java itu sangat menyenangkan";
        System.out.println("Kalimat asli: " + kalimat);

        // Memecah kalimat menjadi potongan kata berdasarkan spasi
        String[] kumpulanKata = kalimat.split(" ");
        String hasil = "";

        // Menelusuri setiap kata di dalam array
        for (String kata : kumpulanKata) {
            // Memastikan kata tidak kosong (menghindari error jika ada spasi ganda)
            if (kata.length() > 0) {
                // Mengambil huruf pertama (indeks 0 sampai 1) dan diubah ke Huruf Besar
                String hurufPertama = kata.substring(0, 1).toUpperCase();
                
                // Mengambil sisa huruf (indeks 1 sampai akhir) dan dipastikan huruf kecil
                String sisaHuruf = kata.substring(1).toLowerCase();
                
                // Menggabungkan kembali kata tersebut dan menambahkan spasi
                hasil += hurufPertama + sisaHuruf + " ";
            }
        }

        // Menghapus spasi tambahan di akhir kalimat menggunakan trim()
        hasil = hasil.trim();
        
        System.out.println("Hasil       : " + hasil);
    }
}
