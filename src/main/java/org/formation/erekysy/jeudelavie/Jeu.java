package org.formation.erekysy.jeudelavie;

public class Jeu {
	public Homme homme;
	public Femme femme;
	
	public Jeu() {
		this.homme=new Homme("male");
		this.femme=new Femme("femele");
	}
	public void lancer() {
		for(int i=0;i<100;i++) {
			homme.vieilleir();
			femme.vieilleir();
			
		}
	}
}
