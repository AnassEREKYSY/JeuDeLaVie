package org.formation.erekysy.jeudelavie;
/**
 * classe Adulte qui implemente l'interface Manger
 * @author hp
 */
public class Adulte implements Manger {

	@Override
	/**
	 * methode redefinit qui retourn une chaine de carteres
	 * @return chaine de carateres
	 */
	public String manger() {
		return "tout";
	}

}
