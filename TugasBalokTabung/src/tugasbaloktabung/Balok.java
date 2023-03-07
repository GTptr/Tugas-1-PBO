/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbaloktabung;

/**
 *
 * @author Lenovo
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
   
    float tinggi;
    
    
    public Balok(float panjang, float lebar, float tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
   
    public float hitungLuas(){
        return super.luas();}
    
    public float hitungKeliling() {
        return super.keliling();
    }
    
    @Override
    public float luasPermukaan() {
        return(2*hitungLuas()) + (2*panjang*tinggi) + (2*lebar*tinggi);
    }

    @Override
    public float volume() {
        return hitungLuas()*tinggi;
    }
    
}
