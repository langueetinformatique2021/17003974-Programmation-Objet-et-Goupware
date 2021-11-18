package TD6;

public class Felin extends Animal {
	//Ajout d'attributs propres à la sous-classe
	protected boolean domestique = false;
	
	/** le constructeur de Felins fait appel au constructeur de la sur-classe Animal*/
	public Felin(String type) { //les felins ont 4 pattes
		super(type, 4);
	}
	/**présentation des caracteristiques du felin */
	public void presente() {
		//appel de la methode de la sur-classe
		super.presente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("Je suis vraiment un animal " + etat);
	}
	/** cri du felin*/
	public void crie() {
		System.out.println("Je crie donc je suis");
	}
}
