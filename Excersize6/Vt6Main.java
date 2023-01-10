package kotitehtava6;
import java.util.Scanner;
import java.util.List;

public class Vt6Main {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Sanalista slista = new Sanalista("sanatiedosto.txt");
		char kirjain = 'a';
		
		List <String> annaSanat = slista.annaSanat();
		Hirsipuu hirsi = new Hirsipuu(annaSanat, 7);

		System.out.println("Tervetuloa pelaamaan! Syötä arvaamasi merkki");
		
		while(true) {
			
			try {
				System.out.print("Arvaa kirjain: ");
				kirjain = sc.next().charAt(0);
				sc.nextLine();
				
				if(hirsi.arvaa(kirjain)) {
					System.out.println("Oikea arvaus!");
				} else {
					System.out.println("Väärä arvaus!");
					
					
				}

				System.out.println("Arvauksia jäljellä: " + hirsi.arvauksiaOnJaljella());
				System.out.println("Oikein arvatut kirjaimet:");
				System.out.print(hirsi.arvaukset()+"\n");
				
				
			} catch (Exception e) {
				System.out.println("Virhe!");
			    sc.nextLine();
			}
				
			if(hirsi.onLoppu() && hirsi.arvauksiaOnJaljella() != 0) {
				System.out.println("Voitit!");
				System.out.println("Sana oli:" + hirsi.sana());
				break;
			}
			if(hirsi.onLoppu()) {
				System.out.println("Hävisit!");
				
				System.out.println("Sana oli:" + hirsi.sana());
				break;
				
			}
		}
		sc.close();
		
		}
		
}
