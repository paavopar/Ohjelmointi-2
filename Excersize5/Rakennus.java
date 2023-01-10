package kotitehtava5;

import java.util.ArrayList;


public class Rakennus{
	//rakennuksen sisäiset muuttujat 
	private String asunnon_pintaala;
	private String asunnon_huoneidenlkm;
	private int asuntojenlkm;
	private ArrayList<Asukas> asukas;
	
	public Rakennus(String []arr, int iasuntojenlkm) {

		this.asuntojenlkm = iasuntojenlkm;
		this.asukas = new ArrayList<>();
		
		for(int i=0; i<arr.length;i++) {
			this.asukas.add(new Asukas(arr[i]));
		}		
	}
	public Rakennus(String uasunnon_huoneidenlkm, String uasunnon_pintaala) {
		this.asunnon_huoneidenlkm=uasunnon_huoneidenlkm;
		this.asunnon_pintaala = uasunnon_pintaala;
	}
	public String getAsunnon_pintaala() {
		return this.asunnon_pintaala;
	}
	public String getAsunnon_huoneidenlkm() {
		return this.asunnon_huoneidenlkm;
	}
	public int getAsuntojenlkm() {
		return this.asuntojenlkm;
	}	
	public void TulostaTiedot() {
	System.out.println("Asuntojen lukumäärä:" + getAsuntojenlkm());
	}
	public void TulostaAsukasTiedot() {
	System.out.println("\nAsukkaiden tiedot:");
	for(Asukas a: asukas  ) {
		System.out.println("Asukkaan nimi:" + a.getAsukkaan_nimi());
	}
}
}