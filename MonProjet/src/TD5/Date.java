package TD5;

import util.Keyboard;

public class Date {
	// attributs de classe
		private int jour, mois, annee;
		
		public boolean CompareTo (Date d) {
			if (annee != d.annee) return true;
			if (mois != d.mois) return true;
			if (jour != d.jour) return true;
			else return false;
			}
		/** Calcul de la date du lendemain */
		public void Incrementer () {
	// Pas de taille indiqu�e dans la d�claration des tableaux
		int lmois[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// prise en compte des annees bissextiles
		if (((annee % 4) == 0) && ((annee % 400) != 0)) lmois[1]++;
		jour++;
		if (jour > lmois[mois-1]) {
			jour = 1; mois ++;
			if (mois == 13) {annee++; mois = 1;}
			}
		}
		/** Affichage de la date */
		public void Afficher() { 
			System.out.println(jour+" "+mois+" "+annee); 
			}

		/** Lecture au clavier de la date */
		private void Lire() {// m�thode lecture d'une date
			jour = Keyboard.getInt("Entrez le jour");
			mois = Keyboard.getInt("Entrez le mois");
			annee = Keyboard.getInt("Entrez l'ann�e");
			}
		
		/**
		 * Cr�ation et initialisation d'une nouvelle instance de Date
		 * @param j jour
		 * @param m mois
		 * @param a ann�e
		 */
		public Date(int j, int m, int a) {  
			jour = j; mois = m; annee = a;
			}

		/**
		 * Cr�ation et lecture clavier d'une nouvelle instance de Date
		 */
		public Date() {Lire();}
		/**
		 * Comparaison entre deux dates
		 * @param d Date compar�e
		 */

		}// fin de la d�claration de la classe date

