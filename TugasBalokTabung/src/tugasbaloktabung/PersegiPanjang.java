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
public class PersegiPanjang implements MenghitungBidang {
    
    final float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }


    @Override
    public float keliling() {
       return 2*(panjang+lebar);
    }

    @Override
    public float luas() {
       return panjang*lebar;
    }
}