package TD5;

public class testfete {

	public static void main(String[] args) {
		Date today = new Date(28,10,2021);
		Date fete = new Date(14,7,2022);
		
		today.Incrementer();
		today.CompareTo(fete);
		
		int nbJours = 0;
		while (today.CompareTo(fete) == true) {
			today.Incrementer();
			nbJours++;
		}
		System.out.println("Le nombre de jour est egal a " + nbJours);
	}

}
