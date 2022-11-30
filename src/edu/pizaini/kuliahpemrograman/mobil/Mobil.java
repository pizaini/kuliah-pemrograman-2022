package edu.pizaini.kuliahpemrograman.mobil;

import java.util.Date;

public class Mobil {
    private String warna;
    private int kecepatan;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void tambahKecepatan(int penambahan){
        this.kecepatan += penambahan;
    }

    public void kurangiKecepatan(int pengurangan){
        this.kecepatan -= pengurangan;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "warna='" + warna + '\'' +
                ", kecepatan=" + kecepatan +
                '}';
    }
}
