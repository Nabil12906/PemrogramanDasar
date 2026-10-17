
package Array;
public class Nilai {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 85, 70};

int max = nilai[0];
int min = nilai[0];

for (int i = 1; i < nilai.length; i++) {
    if (nilai[i] > max) {
        max = nilai[i];
    }
    if (nilai[i] < min) {
        min = nilai[i];
    }
}

System.out.println("Nilai terbesar = " + max);
System.out.println("Nilai terkecil = " + min);
    }
}
