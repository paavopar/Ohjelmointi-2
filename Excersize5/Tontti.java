package kotitehtava5;

import java.util.ArrayList;

public class Tontti {

	//luokan sisäiset muuttujat: tontin_nimi, tontin_sijainti, tontin_pintaala
	
	private String tontin_nimi;
	private String tontin_sijainti;
	private double tontin_pintaala;
	private ArrayList<Rakennus> asuntotiedot;
	
	public Tontti(String utontin_nimi, String utontin_sijainti, double utontin_pintaala,String [][] arr2) {
		this.tontin_nimi = utontin_nimi;
		this.tontin_sijainti = utontin_sijainti;
		this.tontin_pintaala = utontin_pintaala;
		this.asuntotiedot = new ArrayList<>();
		
		for(int i=0; i<arr2.length;i++) {
		this.asuntotiedot.add(new Rakennus(arr2[i][0], arr2[i][1]));
		}
	}
	public String getTontin_nimi() {
		return this.tontin_nimi;
	}
	public String getTontin_sijainti() {
		return this.tontin_sijainti;
	}
	public double getTontin_pintaala() {
		return this.tontin_pintaala;
	}
	
	public void TulostaTiedot() {
		System.out.println("Tontin nimi:" + this.tontin_nimi + "\n" + "Tontin pinta-ala: " + this.tontin_pintaala + " m^2"+"\n" + "Tontin osoite: " + this.tontin_sijainti);
	}
	public void TulostaAsuntoTiedot() {
		System.out.println("Asuntojen pinta-alat ja huoneiden lukumäärät:");
			for(Rakennus asunto: asuntotiedot  ) {
				System.out.println(asunto.getAsunnon_pintaala() + " m^2" + " " + asunto.getAsunnon_huoneidenlkm());
	}
}
}