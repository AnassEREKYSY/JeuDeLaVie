package org.formation.erekysy.jeudelavie;

/**
 * La classe jeu 
 * @author hp
 *
 */
public class Jeu {
	public Homme homme;
	public Femme femme;
	/**
	 * Constructeur de la classe jeu
	 */
	public Jeu() {
		this.homme=new Homme("male");
		this.femme=new Femme("femele");
	}
	/**
	 * methode lancer permet de lancer le jeu et affichier le resultat de la methode veilleir 
	 * sur les deux objets homme et femme
	 */
	public void lancer() {
		for(int i=0;i<100;i++) {
			homme.vieilleir();
			femme.vieilleir();
			System.out.println((i+1)+" "+homme.getInfo()+"**************"+femme.getInfo());
		}
	}
}
