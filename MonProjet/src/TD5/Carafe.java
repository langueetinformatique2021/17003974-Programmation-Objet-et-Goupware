package TD5;

public class Carafe {
	private int contenu_, capacite_;
	/** creation d'une carafe d'une capacite donnee
	 * @param capacite capacite de la carafe en litre
	 */
	public Carafe(int capacite) {      
		capacite_ = capacite;
		contenu_ = 0;
	}
	/** creation d'une carafe d'une capacite donnee et contenant une quantite
	 * @param capacite de la carafe en litre
	 * @param contenu d'eau en litre
	 */
	public Carafe(int capacite, int contenu) {
		capacite_ = capacite;
		if(contenu > capacite)
			contenu_ = capacite;
		else contenu_ = contenu;
		contenu_ = contenu;
	}
	/** remplir completement une carafe */
	public void Remplir() {
		contenu_ = capacite_;
	}
	
	/** vider completement une carafe */
	public void Vider() {
		contenu_ = 0;
	}
	public int Contenu() {
		return contenu_;
	}
	public int Capacite() {
		return capacite_;
	}
	/**
	 * @param autreC l'autre carafe
	 */
	public void Transvaser(Carafe autreC) {
		if (Contenu() < (autreC.Capacite()-autreC.Contenu())){
				autreC.contenu_ += Contenu();
				Vider();
			} else {
				contenu_ = contenu_ - autreC.Capacite() - autreC.Contenu();
				autreC.Remplir();
			}
	}
}
/** toutes les methodes dépende des attributs, il y a des methodes qui lisent les attributs 
 * (accesseur = 5 (vider, remplir, transvaser, contenu, capacité )
*/