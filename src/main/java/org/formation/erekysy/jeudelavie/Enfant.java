package org.formation.erekysy.jeudelavie;

/**
 * classe Enfant qui implemente l'interface Manger
 * @author hp
 */
public class Enfant implements Manger {

	@Override
	/**
	 * methode redefinit qui retourn une chaine de carteres
	 * @return chaine de carateres
	 */
	public String manger() {
		return "purée";
	}

}
