package com.tutorial;

import com.terminal.Console;

import static com.terminal.Console.log;


class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("gass");
        player1.cetak();


        Console.log("menampilkan data dari Console");
        Console.log("Player Name" + player1.getName());

        log("oke gas");
        log("Player Nama " + player1.getName());


    }
    
}
