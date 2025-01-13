package com.tutorial;

public class Pegawai {
    protected String nama;
    protected double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungLembur(int durasiLembur, double persenLembur) {
        return durasiLembur * (persenLembur * gajiPokok);
    }

    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
    
}