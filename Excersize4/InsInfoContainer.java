package kotitehtava4;

import java.util.ArrayList;

public class InsInfoContainer {
	ArrayList<InsuranceInfo> vakuutustiedot;
	
	public InsInfoContainer() {
		vakuutustiedot = new ArrayList<>();

	}

	public void Lisaa(String uKiinteistonTyyppi, String uSijaintiPaikka, double KiinteistonVakuutusarvo) {
		vakuutustiedot.add(new InsuranceInfo(KiinteistonVakuutusarvo,new Property(uKiinteistonTyyppi, uSijaintiPaikka)));	
	}
	public void TulostaKaikki() {

		for (int i = 0; i < vakuutustiedot.size();i++) 
		{ 		
			InsuranceInfo a = vakuutustiedot.get(i);
			System.out.println("Kiinteistön sijainti ja tyyppi:");
			System.out.println(a.getProperty());
			System.out.println("Kiinteistön arvo:");
			System.out.println(a.getKiinteistonVakuutusarvo());
		}


	}
	public void TulostaPienemmat(double rajaarvo) {
		for (int i = 0; i < vakuutustiedot.size();i++) 
		{ 		
			InsuranceInfo a = vakuutustiedot.get(i);
			if (a.getKiinteistonVakuutusarvo() < rajaarvo) {
			System.out.println("Kiinteistön sijainti ja tyyppi:");
			System.out.println(a.getProperty());
			System.out.println("Kiinteistön arvo:");
			System.out.println(a.getKiinteistonVakuutusarvo());
			} 
		}	
	}
	public void TulostaSuuremmat(double rajaarvo) {
		for (int i = 0; i < vakuutustiedot.size();i++) 
		{ 		
			InsuranceInfo a = vakuutustiedot.get(i);
			if (a.getKiinteistonVakuutusarvo() > rajaarvo) {
			System.out.println("Kiinteistön sijainti ja tyyppi:");
			System.out.println(a.getProperty());
			System.out.println("Kiinteistön arvo:");
			System.out.println(a.getKiinteistonVakuutusarvo());
			} 
		}
	}
	
}
