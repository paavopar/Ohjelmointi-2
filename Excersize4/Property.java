package kotitehtava4;

public class Property {
private String KiinteistonTyyppi;
private String SijaintiPaikka;
public Property(String uKiinteistonTyyppi, String uSijaintiPaikka) {
	this.KiinteistonTyyppi = uKiinteistonTyyppi;
	this.SijaintiPaikka = uSijaintiPaikka;
}
public String getKiinteistonTyyppi() {
	return this.KiinteistonTyyppi;
}
public String getSijaintiPaikka() {
	return this.SijaintiPaikka;	
}
public void setKiinteistonTyyppi(String KiinteistonTyyppi) {
	this.KiinteistonTyyppi = KiinteistonTyyppi;
}
public void setSijaintiPaikka(String SijaintiPaikka) {
	this.SijaintiPaikka = SijaintiPaikka;
}
}
