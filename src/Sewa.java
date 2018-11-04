/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NurcahyaNaniaA
 */
public class Sewa {
    private int lamaSewa;
    
    //membuat konstruktor class Sewa
    public Sewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
    
    //membuat method getter dan setter 
    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
    
    //membuat method info untuk menampilkan
    public String info () {
        String info = "" ;
        info += "Lama Sewa : "  + getLamaSewa() +"\n" ;       
        return info ;
    }     
}
