package kotitehtava5;

import java.util.Scanner;

public class Vt5main {
	//Kysyt��n k�ytt�j�lt� tontin tiedot
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {

				System.out.printf("Sy�t� tontin nimi:");
				String tontinnimi = sc.nextLine();
				System.out.printf("Sy�t� tontin osoite:");
				String tontinsijainti = sc.nextLine();
				System.out.printf("Sy�t� tontin pinta-ala:");
				double tontinpintaala = sc.nextDouble();
					if(tontinpintaala<0) {
						System.out.println("Virheellinen pinta-ala!");
						System.exit(0);
				}
				System.out.printf("Sy�t� asuntojen m��r�:");
				int alukumaara = sc.nextInt();
				sc.nextLine();
				String [][] arr2 = new String [alukumaara][2];
					for(int i = 0; i < alukumaara; i++) {
						System.out.print("Sy�t� " + (i+1) + " huoneiden lkm: ");
					    arr2[i][0] = sc.nextLine();
					    System.out.print("Sy�t� " + (i+1) + " pinta-ala: ");
					    arr2[i][1] = sc.nextLine();
					}
				System.out.printf("Sy�t� asukkaiden lukum��r�:");
				int lukumaara = sc.nextInt();
				sc.nextLine();
				String [] arr = new String [lukumaara];
					for(int j = 0; j < lukumaara; j++) {
						System.out.print("Sy�t� " + (j+1) + " nimi: ");
						arr[j] = sc.nextLine();
				}
				
				Rakennus rakennus = new Rakennus(arr, lukumaara );
				Tontti tontti = new Tontti(tontinnimi, tontinsijainti, tontinpintaala, arr2);
				
				tontti.TulostaTiedot();
				rakennus.TulostaTiedot();
				tontti.TulostaAsuntoTiedot();
				rakennus.TulostaAsukasTiedot();
			}
			
		}

}
