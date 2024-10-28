import java.util.Scanner;

class PersegiPanjang {
    // Data member atau ciri
    double panjang;
    double lebar;

    // Constructor
    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method tanpa return dan tanpa parameter untuk mencetak panjang dan lebar
    void cetakDimensi() {
        System.out.println("Panjang: " + this.panjang);
        System.out.println("Lebar: " + this.lebar);
    }

    // Method dengan return dan tanpa parameter untuk menghitung luas
    double hitungLuas() {
        return this.panjang * this.lebar;
    }

    // Method dengan return dan tanpa parameter untuk menghitung keliling
    double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        // Meminta pengguna memasukkan lebar
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        // Membuat objek PersegiPanjang berdasarkan input pengguna
        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);

        // Mencetak dimensi yang dimasukkan
        pp.cetakDimensi();

        // Menghitung dan mencetak luas dan keliling
        System.out.println("Luas: " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());

        // Menutup scanner
        input.close();
    }
}
































