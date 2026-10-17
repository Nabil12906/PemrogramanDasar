
package MateriMethod;
import java.util.Scanner;
public class ContohMethod {
// ===== MODUL PROSES =====
static double tambah(double a, double b) { return a + b; }
static double kurang(double a, double b) { return a - b; }
static double kali(double a, double b) { return a * b; }
static double bagi(double a, double b) {
if (b == 0) {
    System.out.println("Error: pembagian dengan nol.");
return Double.NaN; // NaN = bukan angka
}
return a / b;
}
static double hitung(int pilihan, double a, double b) {
switch (pilihan) {
case 1: return tambah(a, b);
case 2: return kurang(a, b);
case 3: return kali(a, b);
case 4: return bagi(a, b);
default: return 0;
}
}
// ===== MODUL INPUT =====
static int bacaInt(Scanner input, String pesan) {
System.out.print(pesan);
return input.nextInt();
}
static double bacaDouble(Scanner input, String pesan) {
System.out.print(pesan);
return input.nextDouble();
}
// ===== MODUL TAMPILAN =====
static void tampilkanMenu() {
System.out.println("=== KALKULATOR MODULAR ===");
System.out.println("1. Tambah");
System.out.println("2. Kurang");
System.out.println("3. Kali");
System.out.println("4. Bagi&");
System.out.println("0. Keluar");
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int pilihan;
do {
tampilkanMenu();
pilihan = bacaInt(input, "Pilih menu: ");
if (pilihan >= 1 && pilihan <= 4) {
double a = bacaDouble(input, "Angka pertama: ");
double b = bacaDouble(input, "Angka kedua: ");
double hasil = hitung(pilihan, a, b);
if (!Double.isNaN(hasil)) {
System.out.println("Hasil: " + hasil);
}
} else if (pilihan != 0) {
System.out.println("Menu tidak valid");
}
System.out.println();
} while (pilihan != 0);
System.out.println("Terima kasih.");
input.close();
}
}
