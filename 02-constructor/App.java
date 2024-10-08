// class Polos atau tanpa constructor
class Polos{
    // atribut objek
    String dataString;
    int dataInteger;


// class dengan constructor
class mahasiswa{
    // atribut
    String Nama;
    String NIM;
    String prodi;

    // constructor
    // namanya sama dengan nama class
    // tidak memiliki return value/nilai balik
    // method yang pertama kali dipanggil saat objek pertama kali dipanggi 
    mahasiswa(String inputNama, String inputNIM, String inputProdi){
        // mengisi data
       Nama = inputNama;
       NIM = inputNIM;
       prodi = inputProdi;

       // mencetak data
       System.out.println("Nama Mahasiswa :" + Nama);
       System.out.println("NIM: " + NIM);
       System.out.println("Prodi : " + prodi);
    }
}

public class App {
 public static void main(String[]args) throws Exception{
     // pembuatan objek atau instansi objek
     Polos polos_1 = new Polos();

     // isi atribut
     polos_1.dataString = "polos";
     polos_1.dataInteger = 10;

     // cetak objek 
     System.out.println(polos_1.dataString);
     System.out.println(polos_1.dataInteger);

     // pembuatan objek Mahasiswa
      mahasiswa mhs_1 = new mahasiswa("azzam", "23241073", "PTI" );

 }

}