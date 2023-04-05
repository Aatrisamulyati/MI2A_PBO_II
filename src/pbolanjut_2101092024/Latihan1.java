/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbolanjut_2101092024;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class Latihan1 {
    public static void main (String [] args) {

    int n,t,s,diskon;
		
		
		Scanner in = new Scanner (System.in);
		System.out.print ("Input lama main (jam): ");
		n=in.nextInt();
		
		if (n<=3){
			t=n*3000;
			System.out.println ("Anda bermain dibawah/sama dari 3 jam (Rp.3000/jam)");
			System.out.println ("Total harga : Rp"+t);
		}
		
		else {
			s=n-3;
			t=(s*2000)+9000;
			System.out.println ("Anda bermain lebih dari 3 jam (Rp.3000/jam untuk 3 jam pertama + Rp.2000/jam untuk seterusnya)");
			System.out.println ("Total harga : Rp"+t);
		}
		
		
		
	}

}
