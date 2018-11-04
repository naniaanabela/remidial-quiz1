/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NurcahyaNaniaA
 */
public class Main {
    public static void main(String[] args) {
        Peminjam p = new Peminjam("123","Nurcahya Nania");
        Pegawai pe = new Pegawai("111","Helmi Nur");
        Sewa waktu = new Sewa(3);
        Barang barang = new Barang("Kamera SLR",100000,p  , pe, waktu);
        System.out.println(barang.info());
        System.out.println("----------------------------");
    }
}
