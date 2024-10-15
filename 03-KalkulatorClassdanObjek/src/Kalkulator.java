// Class Kalkulator
public class Kalkulator {
    // atribut untuk menyimpan dua angka
    double angka1;
    double angka2;

    // Konstruktor untuk inisialisasi angka
    public Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    // Metode untuk penjumlahan
    public double tambah() {
        return angka1 + angka2;
    }

    // Metode untuk pengurangan
    public double kurang() {
        return angka1 - angka2;
    }

    // Metode untuk perkalian
    public double kali() {
        return angka1 * angka2;
    }

    // Metode untuk pembagian
    public double bagi() {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        // Membuat objek kalkulator dengan dua angka
        Kalkulator kalkulator = new Kalkulator(10, 5);

        // Menampilkan hasil operasi
        System.out.println("Penjumlahan: " + kalkulator.tambah());
        System.out.println("Pengurangan: " + kalkulator.kurang());
        System.out.println("Perkalian: " + kalkulator.kali());
        System.out.println("Pembagian: " + kalkulator.bagi());
    }
}
