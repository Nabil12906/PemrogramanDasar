
package Array;
public class RataRata {

    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 85, 70};

int total = 0;
for (int i = 0; i < nilai.length; i++) {
    total += nilai[i];
}

double rataRata = (double) total / nilai.length;

System.out.println("Total = " + total);
System.out.println("Rata-rata = " + rataRata);
    }
}
