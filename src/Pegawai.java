/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NurcahyaNaniaA
 */
public class Pegawai {
    private String idPegawai;
    private String namaPegawai;

    //membuat konstruktor class Pegawai
    public Pegawai() {
    }

    public Pegawai(String idPegawai, String namaPegawai) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
    }
    
    //membuat getter dan setter 
    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
}
