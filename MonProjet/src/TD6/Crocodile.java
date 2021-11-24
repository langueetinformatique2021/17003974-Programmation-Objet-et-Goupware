package TD6;

public class Crocodile extends Reptile { 
	String nom;
	public Crocodile() {
		super("Crocodile");
	}

	public void crie() {
		if (domestique == false)
			System.out.print("Je lamente donc je suis");
		else
			super.crie();
	}
	public void presente() {
		super.presente();
	}
}
