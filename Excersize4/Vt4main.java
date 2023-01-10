package kotitehtava4;
import java.util.Scanner;

public class Vt4main {

	public static void main(String[] args) {
		InsInfoContainer sailio = new InsInfoContainer();
		sailio.Lisaa("Yksiö", "Kaijonharju", 65000.0);
		sailio.Lisaa("Kaksio", "Linnanmaa", 100000.0);
		sailio.Lisaa("Kolmio","Alppila",150000.0);
		sailio.Lisaa("Yksio", "Kaukovainio", 40000.0);
		sailio.Lisaa("Kaksio","Toppilansalmi", 125000.0);
		
		sailio.TulostaKaikki();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.printf("Syötä haluamasi raja-arvo");
			double rajaarvo = sc.nextDouble();
			System.out.println("Arvoa halvemmat kiinteistöt:");
			sailio.TulostaPienemmat(rajaarvo);
			System.out.println("Arvoa kalliimmat kiinteistöt:");
			sailio.TulostaSuuremmat(rajaarvo);
		}
		

}
}