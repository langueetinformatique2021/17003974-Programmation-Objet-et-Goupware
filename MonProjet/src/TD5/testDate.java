package TD5;

public class testDate {

	public static void main(String[] args) {
		// Instanciation de deux objets de type date
		Date today = new Date(); 
		Date dfin = new Date();

		today.Afficher(); dfin.Afficher();
		do { today.Incrementer(); today.Afficher(); }
		while (today.CompareTo(dfin));

	}

}
