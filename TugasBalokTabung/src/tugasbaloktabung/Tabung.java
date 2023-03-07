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
public class Tabung extends Lingkaran implements MenghitungRuang {

    final float tinggi;
    
    public Tabung(float jari, float tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    
    public float hitungLuas() {
        return super.luas();
    }
    
    public float hitungKeliling() {
        return super.keliling();
    }


    @Override
    public float luasPermukaan() {
        return (2*hitungLuas()) + (hitungKeliling()*tinggi);
    }

    @Override
    public float volume() {
        return hitungLuas()*tinggi;
    }
    
    
}
