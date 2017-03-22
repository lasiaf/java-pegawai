/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Scanner;

package hitung;

/**
 *
 * @author Handa Kusuo
 */
import java.util.Scanner;
public class Hitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int a, b;
        boolean c = true;
        
        if (c = false){
            System.out.printf("Masukan : ");
            a = masukan.nextInt();
            b = (a * 4 * 3)/2;
            System.out.printf("Output : "+b);
        }
        else{
            System.out.printf("Tidak memenuhi syarat %.2f\n",b);
            System.out.println("Klik enter untuk menutup");
        }
    }
    
}
