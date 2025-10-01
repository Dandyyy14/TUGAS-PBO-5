import java.util.Scanner;

public class HitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble();

        // Hitung IMT
        double imt = berat / (tinggi * tinggi);

        // Tentukan kategori
        String kategori;
        if (imt <= 18.4) {
            kategori = "Berat Badan Kurang";
        } else if (imt <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (imt <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else if (imt <= 39.9) {
            kategori = "Gemuk";
        } else {
            kategori = "Sangat Gemuk";
        }

        // Output
        System.out.println("\n=== HASIL IMT ===");
        System.out.println("Nilai IMT : " + String.format("%.2f", imt));
        System.out.println("Kategori  : " + kategori);

        input.close();
    }
}
