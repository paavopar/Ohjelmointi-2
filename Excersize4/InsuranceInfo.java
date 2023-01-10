package kotitehtava4;

public class InsuranceInfo {
private double KiinteistonVakuutusarvo;
private Property property;
public InsuranceInfo(double uKiinteistonVakuutusarvo,Property uproperty) {
	this.KiinteistonVakuutusarvo = uKiinteistonVakuutusarvo;
	this.property = uproperty;
}
public String getProperty() {
	return this.property.getKiinteistonTyyppi() + " " + this.property.getSijaintiPaikka();
}
public double getKiinteistonVakuutusarvo() {
	return this.KiinteistonVakuutusarvo;
}
public void setKiinteistonVakuutusarvo(double KiinteistonVakuutusarvo) {
	this.KiinteistonVakuutusarvo = KiinteistonVakuutusarvo;
}
public void setProperty(Property property) {
	this.property = property;
}
}
