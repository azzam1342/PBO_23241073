class Mahasiswa {
    // Data Member atau ciri
    String Nama;
    String NIM;

    // Constructor
    Mahasiswa(String Nama, String NIM) {
        this.Nama = Nama;
        this.NIM = NIM;
    }

    // Method tanpa return dan tanpa parameter
    void cetak() {
        System.out.println("Nama : " + this.Nama);
        System.out.println("NIM : " + this.NIM);
    }

    // Method dengan parameter dan tanpa return
    void setNama(String nama) { 
        this.Nama = nama;
    }

    // Method dengan return dan tanpa parameter
    String getNama() {
        return this.Nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan parameter dan return
    String SayHello(String pesan) {
        return "Hello" + this.Nama + pesan;
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat Objek
        Mahasiswa mhs_1 = new Mahasiswa("azzam", "123456789");

        // Memanggil nama method tanpa parameter dan return
        mhs_1.cetak();

        // Memanggil method dengan parameter tanpa return
        mhs_1.setNama("ucup");
        mhs_1.cetak();
        
        //memanggil method dengan return tanpa parameter
        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());

        String pesan = mhs_1.SayHello("sukses selalu belajarnya");
        System.out.println(pesan);
    }
}