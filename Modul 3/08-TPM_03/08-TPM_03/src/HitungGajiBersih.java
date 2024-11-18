// Kelas HitungGajiBersih
public class HitungGajiBersih {
    // Atribut private
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Metode untuk mengatur nilai gaji pokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Metode untuk mengambil nilai gaji pokok
    public int getGajiPokok() {
        return gajiPokok;
    }

    // Metode untuk mengatur nilai tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Metode untuk mengambil nilai tunjangan
    public int getTunjangan() {
        return tunjangan;
    }

    // Metode untuk mengatur nilai pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Metode untuk mengambil nilai pajak
    public double getPajak() {
        return pajak;
    }

    // Metode untuk mencetak gaji bersih
    public void cetakGajiBersih() {
        double gajiBersih = (gajiPokok + tunjangan) - ((gajiPokok + tunjangan) * pajak / 100);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }

    // Main Method
    public static void main(String[] args) {
        // Membuat objek HitungGajiBersih
        HitungGajiBersih gaji = new HitungGajiBersih();

        // Mengatur nilai gaji pokok, tunjangan, dan pajak
        gaji.setGajiPokok(5000000); // Contoh gaji pokok
        gaji.setTunjangan(3000000); // Contoh tunjangan
        gaji.setPajak(10); // Contoh pajak dalam persen

        // Mencetak gaji bersih
        gaji.cetakGajiBersih();
    }
}