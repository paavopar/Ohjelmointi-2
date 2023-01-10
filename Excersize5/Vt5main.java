package kotitehtava5;

import java.util.Scanner;

public class Vt5main {
	//Kysytään käyttäjältä tontin tiedot
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {

				System.out.printf("Syötä tontin nimi:");
				String tontinnimi = sc.nextLine();
				System.out.printf("Syötä tontin osoite:");
				String tontinsijainti = sc.nextLine();
				System.out.printf("Syötä tontin pinta-ala:");
				double tontinpintaala = sc.nextDouble();
					if(tontinpintaala<0) {
						System.out.println("Virheellinen pinta-ala!");
						System.exit(0);
				}
				System.out.printf("Syötä asuntojen määrä:");
				int alukumaara = sc.nextInt();
				sc.nextLine();
				String [][] arr2 = new String [alukumaara][2];
					for(int i = 0; i < alukumaara; i++) {
						System.out.print("Syötä " + (i+1) + " huoneiden lkm: ");
					    arr2[i][0] = sc.nextLine();
					    System.out.print("Syötä " + (i+1) + " pinta-ala: ");
					    arr2[i][1] = sc.nextLine();
					}
				System.out.printf("Syötä asukkaiden lukumäärä:");
				int lukumaara = sc.nextInt();
				sc.nextLine();
				String [] arr = new String [lukumaara];
					for(int j = 0; j < lukumaara; j++) {
						System.out.print("Syötä " + (j+1) + " nimi: ");
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
