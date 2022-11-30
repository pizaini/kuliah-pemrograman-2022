package edu.pizaini.kuliahpemrograman;

import java.util.Date;

public class Mahasiswa {
    private String nama;
    private String nim; // tidak utk dihitung
    private String jenisKelamin;
    private int ip;
    private int ipk;
    private Date tanggalLahir;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getIpk() {
        return ipk;
    }

    public void setIpk(int ipk) {
        this.ipk = ipk;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getUmur(){
        return 0;
    }

    public static void iniStatic(){

    }

}
