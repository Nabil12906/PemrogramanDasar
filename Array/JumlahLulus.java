
package Array;
public class JumlahLulus {
    public static void main(String[] args) {
        int[] nilai = {80, 65, 90, 70, 85};

int jumlahLulus = 0;

for (int i = 0; i < nilai.length; i++) {
    if (nilai[i] >= 75) {
        jumlahLulus++;
    }
}

System.out.println("Jumlah mahasiswa lulus = " + jumlahLulus);
    }
}
