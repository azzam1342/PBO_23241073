class Display{
    // variabel objek/ data member
    private String nama;
    // variabel static milik class
    static String tipe = "Display";


    // construktor
    Display (String nama){
    this.nama = nama;
    }

    // method stter
    void setTipe (String tipeInput){
        // tipe = tipeInput; // cara 1
        // this.tipe = tipeInput; // cara 2
        Display.tipe = tipeInput; // cara 3
    }

    // method cetak 
    void cetak(){
        System.out.println("Display name : " + this.nama);
    }
}


public class App {
    public static void main(String[] args) {
        // instansiasi objek
        Display display1 = new Display("monitor");
        display1.cetak();
        Display display2 = new Display("keyboard");
        display2.cetak();

        // menampilkan isi static variabel
       System.out.println("menampilkan static variabel");
       System.out.println("objek1 : " + display1.tipe);
       System.out.println("objek2 : " + display2.tipe);
       System.out.println("class : " + Display.tipe);

       // menulis ulang isi variabel static
       // display1.tipe = "tampilan";
       // display2.tipe = "tampilan";
       Display.tipe = "tampilan";


       // menggunakkan setter
       display1.setTipe("spanduk");


       // memanggil isi variabel static
       System.out.println("menampilkan static variabel");
       System.out.println("objek1 : " + display1.tipe);
       System.out.println("objek2 : " + display2.tipe);
       System.out.println("class : " + Display.tipe);

    }
}