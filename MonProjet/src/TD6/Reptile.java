package TD6;

public class Reptile extends Animal {
	//Ajout d'attributs propres à la sous-classe
	protected boolean domestique = false;
	
	/** le constructeur de Reptile fait appel au constructeur de la sur-classe Animal*/
	public Reptile(String type) { //les Reptiles ont 4 pattes ou 0 pattes
		super(type, 4 );
	}
	/**présentation des caracteristiques du felin */
	public void presente() {
		//appel de la methode de la sur-classe
		super.presente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("Je suis vraiment un animal " + etat);
	}
	/** cri du Reptile*/
	public void crie() {
		System.out.println("Je crie donc je suis");
	}
}
