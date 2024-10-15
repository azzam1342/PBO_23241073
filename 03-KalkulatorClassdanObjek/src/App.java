import java.util.Scanner;

class Kalkulator {
    // Method untuk penjumlahan
    double penjumlahan(double a, double b) {
        return a + b;
    }

    // Method untuk pengurangan
    double pengurangan(double a, double b) {
        return a - b;
    }

    // Method untuk perkalian
    double perkalian(double a, double b) {
        return a * b;
    }

    // Method untuk pembagian
    double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
    }
}

public class App {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        String lanjut;

        // Loop untuk terus melakukan perhitungan sampai pengguna memilih untuk berhenti
        do {
            // Meminta input pengguna
            System.out.println("Pilih operasi yang ingin dilakukan:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            int pilihan = scanner.nextInt();

            // Meminta input angka dari pengguna
            System.out.print("Masukkan angka pertama: ");
            double a = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double b = scanner.nextDouble();

            // Menggunakan switch untuk menentukan operasi berdasarkan pilihan pengguna
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil penjumlahan: " + calc.penjumlahan(a, b));
                    break;
                case 2:
                    System.out.println("Hasil pengurangan: " + calc.pengurangan(a, b));
                    break;
                case 3:
                    System.out.println("Hasil perkalian: " + calc.perkalian(a, b));
                    break;
                case 4:
                    System.out.println("Hasil pembagian: " + calc.pembagian(a, b));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Meminta pengguna untuk melanjutkan atau berhenti
            System.out.print("Apakah Anda ingin melanjutkan perhitungan? (y/t): ");
            lanjut = scanner.next();

            System.out.println();  // Baris baru untuk estetika
        } while (lanjut.equalsIgnoreCase("y"));

        // Menutup program dengan pesan terima kasih
        System.out.println("Terima kasih sudah menggunakan kalkulator.");
        scanner.close();
    }
}
