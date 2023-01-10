import java.util.Scanner;

public class koti2main {
//Kysytään käyttäjältä tontin tiedot
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.printf("Syötä asukkaiden lukumäärä:");
			int lukumaara = sc.nextInt();
			sc.nextLine();
			String [][] arr = new String [lukumaara][2];
			for(int i = 0; i < lukumaara; i++) {
				System.out.print("Syötä " + (i+1) + " nimi: ");
			    arr[i][0] = sc.nextLine();
			    System.out.print("Syötä asukkaan " + (i+1) + " syntymäaika: ");
			    arr[i][1] = sc.nextLine();
			}
			System.out.printf("Syötä tontin nimi:");
			String tontinnimi = sc.nextLine();
			System.out.printf("Syötä tontin sijainti:");
			String tontinsijainti = sc.nextLine();
			System.out.printf("Syötä tontin pinta-ala:");
			double tontinpintaala = sc.nextDouble();
			System.out.printf("Syötä rakennuksen pinta-ala:");
			double rakpintaala = sc.nextDouble();
			System.out.printf("Syötä rakennuksen huoneiden lukumäärä:");
			int huoneidenlukumaara = sc.nextInt();
			
			Rakennus rakennus = new Rakennus(rakpintaala, huoneidenlukumaara, arr);
			Tontti tontti = new Tontti(tontinnimi, tontinsijainti, tontinpintaala, rakennus);
			
			tontti.TulostaTiedot();
		}
		
	}

}
