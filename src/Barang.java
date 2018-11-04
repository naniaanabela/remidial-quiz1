/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NurcahyaNaniaA
 */
public class Barang {
    private String jenisBarang;
    private int harga;
    private Peminjam pinjam; //membuat atribut relasi (Class Barang berelasi dengan class Peminjam)
    private Pegawai pegawai; //membuat atribut relasi (Class Barang berelasi dengan class Pegawai)
    private Sewa sewa; //membuat atribut relasi (Class Barang berelasi dengan class Sewa)
    
    //membuat konstruktor class Barang
    public Barang() {
    }

    public Barang(String jenisBarang, int harga, Peminjam pinjam, Pegawai pegawai, Sewa sewa) {
        this.jenisBarang = jenisBarang;
        this.harga = harga;
        this.pinjam = pinjam;
        this.pegawai = pegawai;
        this.sewa = sewa;
    }
    
    //membuat method getter dan setter
    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Peminjam getPinjam() {
        return pinjam;
    }

    public void setPinjam(Peminjam pinjam) {
        this.pinjam = pinjam;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Sewa getSewa() {
        return sewa;
    }

    public void setSewa(Sewa sewa) {
        this.sewa = sewa;
    }
    
    //membuat method totalSewa untuk melakukan perhitungan uang yang harus dibayar oleh peminjam yang menyewa
    public int totalSewa(){
        int total = this.sewa.getLamaSewa() * this.getHarga();
        return total;
    }
}
