package TD6;

public abstract class Animal {
	private String espece;
	private int nb_pattes = 0;
	
	/**Creation d'une nouvelle instance de la classe animal
	 * @param type nom de l'espece
	 * @param pattes nomnre de pattes
	 */
	public Animal(String type, int pattes) {
		espece = type;
		nb_pattes = pattes;
		
	}
	public void presente() {
		System.out.println("je suis un représentant de l'espece des "+ espece + " et j'ai "+ nb_pattes+ "pattes" );
	
	}
}
