
package Array;
public class PencarianData {
    public static void main(String[] args) {
       int[] nilai = {80, 75, 90, 85, 70};

int cari = 90;
boolean ditemukan = false;

for (int i = 0; i < nilai.length; i++) {
    if (nilai[i] == cari) {
        ditemukan = true;
        break;
    }
}

if (ditemukan) {
    System.out.println("Data ditemukan");
} else {
    System.out.println("Data tidak ditemukan");
}
    }
}
