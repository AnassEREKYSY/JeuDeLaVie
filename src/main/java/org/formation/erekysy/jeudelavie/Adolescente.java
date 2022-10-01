package org.formation.erekysy.jeudelavie;
/**
 * classe Adolescente qui implemente l'interface Manger
 * @author hp
 */
public class Adolescente implements Manger {

	@Override
	/**
	 * methode redefinit qui retourn une chaine de carteres
	 * @return chaine de carateres
	 */
	public String manger() {
		return "salade";
	}

}
