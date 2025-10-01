import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan total pembelian: Rp ");
        double total = input.nextDouble();

        // Hitung potongan
        double potongan;
        if (total < 50000) {
            potongan = 0.05 * total;
        } else {
            potongan = 0.20 * total;
        }

        double bayar = total - potongan;

        // Output
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Total pembelian : Rp " + total);
        System.out.println("Potongan        : Rp " + potongan);
        System.out.println("Jumlah bayar    : Rp " + bayar);

        input.close();
    }
}
