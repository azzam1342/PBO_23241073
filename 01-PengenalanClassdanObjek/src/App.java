//membuat class sebagai template
class Mahasiswa{
    // membuat ciri ciri atau atribut  objek
    String nama;
    String NIM;
    String prodi;
    Double IPK;
    int umur;

}



public class App {
    public static void main(String[] args) throws Exception {
   
    // instansiasi atau membuat objek 
    Mahasiswa mhs_1 = new Mahasiswa ();
    Mahasiswa mhs_2 = new Mahasiswa ();

    // pengisian data objek 
    mhs_1.nama = "azzam";
    mhs_1.NIM = "23241073";
    mhs_1.prodi ="PTI";
    mhs_1.IPK = 3.61;
    mhs_1.umur = 20;

    //cetak data
    System.out.println ("Nama Mahasiswa : + mhs_1.nama");
    System.out.println("NIM : " + mhs_1.prodi);
    System.out.println("Prodi : " + mhs_1.prodi);
    System.out.println("IPK : " + mhs_1.IPK);
    System.out.println("Umur : " + mhs_1.umur);

    // pengisian data objek
    mhs_2.nama = "ucup";
    mhs_2.NIM = "24643623";
    mhs_2.prodi = "PTI";
    mhs_2.IPK = 3.50;
    mhs_2.umur = 21;

    //cetak data 
    System.out.println ("Nama Mahasiswa : + mhs_2.nama");
    System.out.println("NIM : " + mhs_2.prodi);
    System.out.println("prodi : " + mhs_2.prodi);
    System.out.println("IPK : " + mhs_2.IPK);
    System.out.println("Umur :" + mhs_2.umur);
    





    }
}
