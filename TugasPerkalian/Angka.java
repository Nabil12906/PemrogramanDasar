
package TugasPerkalian;
import java.util.Scanner;
public class Angka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt(); 
        System.out.println("Tabel perkalian untuk " + angka + ":");
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
        
        input.close();
    }
}
