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
    
    
}
