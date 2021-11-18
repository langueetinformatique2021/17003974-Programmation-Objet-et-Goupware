package TD4;

public class Iteration {
	public static void main(String[] args) {
		String[] prenoms = { "Christian", "Karenne", "Victoria", "Agatha", "Philippe", "Djamé" };

		int imin = 0;/**initialisation de imin = 0**/
		for (int i = 1; i < prenoms.length; i++) {		/**i = 1 pour la longueur du prenoms qui est plus grand que i**/
			if (prenoms[i].compareTo(prenoms[imin]) < 0)/**si on compareTo le prenoms de longueur i au prenom**/
				imin = i;

		}
		System.out.println(prenoms[imin]);

	}

}
