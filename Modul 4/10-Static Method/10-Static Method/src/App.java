import java.util.ArrayList;

class Player{
    // variable objek
    private String nama;
    // variable static
    private static int numberOfPlayer;
    // Arry Variable
    private static ArrayList<String> namaList = new ArrayList<String>();

    // Konsstruktor 
    Player(String nama){
    this.nama = nama;
    Player.numberOfPlayer++;
    Player.namaList.add(this.nama);

    }

    // Method static Cetak NUmberOfPlayer
    static void showNumberOfPlayer(){
        System.out.println("Numbr OfPlayer : " + Player.numberOfPlayer);
    }

    void cetak(){
        System.out.println("player nama : ");
    }

    // Method statuc Getter
    static ArrayList<String> getName(){
        return Player.namaList;
    }
}


public class App {
    public static void main(String[] args) throws Exception {

    Player player1 = new Player("kingilham");
    Player player2 = new Player("arbiyan");
    Player player3 = new Player("adin");
    Player player4 = new Player("heril");
    Player player5 = new Player("Mesud");
    Player player6 = new Player("azam");


    Player.showNumberOfPlayer();
    player1.cetak();
    player2.cetak();
    player3.cetak();
    player4.cetak();
    player5.cetak();
    player6.cetak();

    // Panggil array nama obejek
    System.out.println("Nama : " + Player.getName() );

    }
}