package kotitehtava6;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Sanalista {
	private List<String> sanalista;
	
	
	public Sanalista(String tnimi) {
		this.sanalista = new ArrayList<>();
		System.out.println(tnimi);
	
		File sanatiedosto = new File(tnimi);
		try {
		Scanner sc = new Scanner(sanatiedosto);
		
		while(sc.hasNextLine()) {
			sanalista.add(sc.nextLine());
		}
		sc.close();

	
		} catch (Exception e ) {
			System.out.println("Tiedostoa ei löydy!");
		}
	}
		
	public List <String> annaSanat() {
		return this.sanalista;
	}	



}



