package kotitehtava6;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class Hirsipuu {
	
Scanner sc = new Scanner (System.in);
private int ArvaustenMaara= 0;
private String arpasana;
private String alkupsana;
private Character merkki;
private List <Character>arvaukset = new ArrayList<Character>();
private int Maksimiarvaukset = 6;


public Hirsipuu(List<String> sanat, int umaxarv) {
	this.Maksimiarvaukset = umaxarv;
	Random rand = new Random();
	this.arpasana = sanat.get(rand.nextInt(sanat.size()));
	this.alkupsana = arpasana;
}

public List <Character> getArvaukset(){
	return this.arvaukset;
}

public String getArpasana() {
	return this.arpasana;
}

public int getArvaustenMaara() {
	return this.ArvaustenMaara;
}

public Character getMerkki() {
	return this.merkki;
}

public boolean arvaa (char merkki) {
	
	

	StringBuilder s = new StringBuilder(arpasana);
	
	if (s.toString().indexOf(merkki) != -1) {
		int i = s.toString().indexOf(merkki);
		s.deleteCharAt(i);
		arvaukset.add(merkki);
		this.arpasana = s.toString();
		return true;
	}
	else
	{
		Maksimiarvaukset--;
		return false;	
	}

}

public List<Character> arvaukset(){
	return arvaukset;
}


public int getMaksimiarvaukset() {
	return this.Maksimiarvaukset;
}

public int arvauksiaOnJaljella() {
	System.out.println("Sanan pituus:");
	System.out.println(this.alkupsana.length());
	
	return Maksimiarvaukset;

	
}


public String sana() {
	return this.alkupsana;
}

public boolean onLoppu() {
	if(this.Maksimiarvaukset==0) {
		return true;
	}
	
	if(this.arvaukset.size() == this.alkupsana.length()) {
		return true;
	}
	
	return false;
}
}




