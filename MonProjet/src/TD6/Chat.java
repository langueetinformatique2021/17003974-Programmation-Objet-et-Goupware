package TD6;


public class Chat extends Felin implements Domesticable {
	String nom;
	
	public Chat() {
		super("Chat");
		
	}
		
	public void domestiquer(String nom) {
		domestique = true;
		this.nom = nom;

	}

	public String nom() {
		return nom;
	}

	public void présente() {
		super.presente();
		if (domestique == true)
			System.out.println("Je m'appelle " + nom());
	}

	public void crie() {
		if (domestique == true)
			System.out.print("Je miaule donc je suis");
		else
			super.crie();
	}
}
