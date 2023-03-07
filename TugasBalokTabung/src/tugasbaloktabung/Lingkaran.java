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
public class Lingkaran implements MenghitungBidang {
    
    final float jari;  float PI = (float) 3.14;
    
    
    
    public Lingkaran(float jari) {
        this.jari = jari ;
    }

 

    @Override
    public float luas() {
        return PI*jari*jari;
    }

    @Override
    public float keliling() {
        return 2*PI*jari;
    }
    
}
