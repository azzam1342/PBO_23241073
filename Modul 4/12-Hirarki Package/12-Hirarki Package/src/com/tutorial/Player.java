package com.tutorial;

import com.terminal.Console;
// visibiliti default hanya bisa diakses oleh package yang sama
class Player {
    // variabel objek
    private String nama;

    // kostruktor
    Player (String nama){
        this.nama = nama;

    }

    // method cetak
    void cetak(){
        System.out.println("Nama : " +  this.nama);

        Console.log("menggunakan console");
        Console.log("Nama : " + this.nama);
    }

    // method getter
    String getName(){
        return this.nama;
    }
    
}