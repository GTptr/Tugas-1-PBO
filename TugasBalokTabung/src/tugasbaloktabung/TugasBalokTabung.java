/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbaloktabung;

import java.util.Scanner;

public class TugasBalokTabung {

   
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in); // Gak mau input ah, maunya pake cin boleh kan?//
        char ulang = 'y'; 
        int pilih;
        float panjang, lebar, tinggi, jari;
     
        
        while(ulang == 'y' || ulang == 'Y'){
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. exit");
        System.out.printf("Pilih : ");
        pilih = cin.nextInt(); // Biar bisa input char //
        
        switch(pilih){
            
            case 0 : 
                ulang='n';
                break;
            case 1 : 
                
                System.out.println("==========");
                System.out.println("Hitung Balok");
                System.out.printf("==========\n\n");
                System.out.printf("Panjang\t: ");
                panjang = cin.nextFloat();
                System.out.printf("\nLebar\t: ");
                lebar = cin.nextFloat();
                System.out.printf("\nTinggi\t: ");
                tinggi = cin.nextFloat();
                
                Balok menghitungBalok = new Balok(panjang, lebar, tinggi);
                System.out.println("Keliling Persegi Panjang\t: " + menghitungBalok.hitungKeliling());
                System.out.println("Luas Persegi Panjang\t:" + menghitungBalok.hitungLuas());
                System.out.println("Volume Balok\t\t:" + menghitungBalok.volume());
                System.out.println("Luas Permukaan Balok\t: " + menghitungBalok.luasPermukaan());
               break; 
               
            case 2 : 
                
                System.out.println("==========");
                System.out.println("Hitung Tabung");
                System.out.printf("==========\n\n");
                System.out.printf("Jari-jari\t: ");
                jari = cin.nextFloat();
                System.out.printf("\nTinggi\t: ");
                tinggi = cin.nextFloat();
                
                Tabung menghitungTabung = new Tabung(jari, tinggi);
                System.out.println("Keliling Lingkaran\t\t: " + menghitungTabung.hitungKeliling());
                System.out.println("Luas Lingkaran\t\t:" + menghitungTabung.hitungLuas());
                System.out.println("Volume Tabung\t\t:" + menghitungTabung.volume());
                System.out.println("Luas Permukaan Tabung\t: " + menghitungTabung.luasPermukaan());
               break;
            
            default : 
                     System.out.printf("Input yang anda masukkan invalid!!!\n\n");
                     break;
             }
        
             if(ulang != 'n'){
                 System.out.printf("Kembali ke menu : ");
                 ulang = cin.next().charAt(0);}
        
        
        
        }
    }
    
}
