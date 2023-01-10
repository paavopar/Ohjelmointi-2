
public class Tontti {
	
	//luokan sisäiset muuttujat: tontin_nimi, tontin_sijainti, tontin_pintaala
	
	private String tontin_nimi;
	private String tontin_sijainti;
	private double tontin_pintaala;
	private Rakennus rakennus;
	
	public Tontti(String utontin_nimi, String utontin_sijainti, double utontin_pintaala, Rakennus urakennus) {
		this.tontin_nimi = utontin_nimi;
		this.tontin_sijainti = utontin_sijainti;
		this.tontin_pintaala = utontin_pintaala;
		this.rakennus = urakennus;
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

	public Rakennus getRakennus() {
		return this.rakennus;
	}
	public void TulostaTiedot() {
	System.out.println("Tontin nimi:" + this.tontin_nimi + "\n" + "Tontin pinta-ala: " + this.tontin_pintaala + "\n" + "Tontin sijainti: " + this.tontin_sijainti);
	this.rakennus.TulostaTiedot();
	}
}
