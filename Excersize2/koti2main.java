import java.util.Scanner;

public class koti2main {
//Kysyt��n k�ytt�j�lt� tontin tiedot
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.printf("Sy�t� asukkaiden lukum��r�:");
			int lukumaara = sc.nextInt();
			sc.nextLine();
			String [][] arr = new String [lukumaara][2];
			for(int i = 0; i < lukumaara; i++) {
				System.out.print("Sy�t� " + (i+1) + " nimi: ");
			    arr[i][0] = sc.nextLine();
			    System.out.print("Sy�t� asukkaan " + (i+1) + " syntym�aika: ");
			    arr[i][1] = sc.nextLine();
			}
			System.out.printf("Sy�t� tontin nimi:");
			String tontinnimi = sc.nextLine();
			System.out.printf("Sy�t� tontin sijainti:");
			String tontinsijainti = sc.nextLine();
			System.out.printf("Sy�t� tontin pinta-ala:");
			double tontinpintaala = sc.nextDouble();
			System.out.printf("Sy�t� rakennuksen pinta-ala:");
			double rakpintaala = sc.nextDouble();
			System.out.printf("Sy�t� rakennuksen huoneiden lukum��r�:");
			int huoneidenlukumaara = sc.nextInt();
			
			Rakennus rakennus = new Rakennus(rakpintaala, huoneidenlukumaara, arr);
			Tontti tontti = new Tontti(tontinnimi, tontinsijainti, tontinpintaala, rakennus);
			
			tontti.TulostaTiedot();
		}
		
	}

}
