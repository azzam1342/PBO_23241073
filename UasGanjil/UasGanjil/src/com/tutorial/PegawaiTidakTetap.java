package com.tutorial;

public class PegawaiTidakTetap extends Pegawai{
    private int durasiLembur;
    private final double persenLembur = 0.05;
    private double gajiBersih;

    public PegawaiTidakTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.durasiLembur = 0;
        hitungGajiBersih();
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
        hitungGajiBersih();
    }

    private void hitungGajiBersih() {
        double lembur = hitungLembur(durasiLembur, persenLembur);
        this.gajiBersih = gajiPokok + lembur;
    }

    public void display() {
        super.display();
        System.out.println("Durasi Lembur: " + durasiLembur);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
    
}