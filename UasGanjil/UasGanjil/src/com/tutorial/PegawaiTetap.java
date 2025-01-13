package com.tutorial;

public class PegawaiTetap extends Pegawai{
    private double tunjangan;
    private int durasiLembur;
    private final double persenLembur = 0.1;
    private double gajiBersih;

    public PegawaiTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = 0.7 * gajiPokok;
        this.durasiLembur = 0;
        hitungGajiBersih();
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
        hitungGajiBersih();
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
        hitungGajiBersih();
    }

    private void hitungGajiBersih() {
        double lembur = hitungLembur(durasiLembur, persenLembur);
        this.gajiBersih = gajiPokok + tunjangan + lembur;
    }

    public void display() {
        super.display();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Durasi Lembur: " + durasiLembur);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
    
}