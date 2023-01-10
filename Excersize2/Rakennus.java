import java.util.ArrayList;

public class Rakennus {
	//rakennuksen sisäiset muuttujat 
	private double rakennuksen_pintaala;
	private int rakennuksen_huoneidenlkm;
	private ArrayList<Asukkaat> asukas;
	
	public Rakennus(double ipintaala, int ihuoneet, String [][] lista) {
		this.rakennuksen_pintaala = ipintaala;
		this.rakennuksen_huoneidenlkm = ihuoneet;
		this.asukas = new ArrayList<>();


		for(int i=0; i<lista.length;i++) {
		this.asukas.add(new Asukkaat(lista[i][0], lista[i][1]));
		}
	}
	
	public double getRakennuksen_pintaala() {
		return this.rakennuksen_pintaala;
	}

	public int getRakennuksen_huoneidenlkm() {
		return this.rakennuksen_huoneidenlkm;
	}
	public void TulostaTiedot() {
	System.out.println("Rakennuksen pinta-ala: " + this.rakennuksen_pintaala + "\n" + "Rakennuksen huoneiden lukumäärä: " + this.rakennuksen_huoneidenlkm);
	System.out.println("\nAsukkaiden tiedot:");
	for(Asukkaat a: asukas  ) {
		System.out.println(a.getAsukkaan_nimi() + "  " + a.getAsukkaan_syntymapaiva());
	}
}
}
