import java.util.ArrayList;

class Player {
    // variabel objek
    private String nama;
    // variabel static
    private static int numberOfPlayer;
    // array variabel
    private static ArrayList<String> namaArrayList = new ArrayList<>();

    // konstruktor
    Player(String nama) {
        this.nama = nama;
        Player.numberOfPlayer++;
        Player.namaArrayList.add(this.nama);
    }

    // metode static
    static void showNumberOfPlayer() {
        System.out.println("Number of Players: " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNama() {
        return Player.namaArrayList;
    }

    // method static data
    void cetak() {
        System.out.println("Player Name: " + this.nama);
    }
}

public class App {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("kingilham");
        Player player2 = new Player("masud");
        Player player3 = new Player("haeril");
        Player player4 = new Player("arbyan");
        Player player5 = new Player("azzam");

        // Menampilkan jumlah pemain
        Player.showNumberOfPlayer();

        // Memanggil metode cetak untuk setiap pemain
        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
        player5.cetak();

        // Menampilkan semua nama pemain
        System.out.println("Panggil Name: " + Player.getNama());
    }
}