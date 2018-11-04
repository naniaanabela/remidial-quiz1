/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NurcahyaNaniaA
 */
public class Peminjam {
    private String idPeminjam;
    private String namaPeminjam;
    
    //membuat konstruktor class Peminjam
    public Peminjam(String idPeminjam, String namaPeminjam){
        this.idPeminjam = idPeminjam;
        this.namaPeminjam = namaPeminjam;
    }

    //membuat Setter dan Getter
    public String getIdPeminjam() {
        return idPeminjam;
    }

    public void setIdPeminjam(String idPeminjam) {
        this.idPeminjam = idPeminjam;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }
    
    //membuat method info
    public String info () {
        String info = "" ;
        info += "id peminjam : " + this.idPeminjam + "\n";
        info += "Nama peminjam : " + this.namaPeminjam + "\n";
        return info;
    }
}
