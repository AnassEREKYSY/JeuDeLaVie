package org.formation.erekysy.jeudelavie;
/**
 * classe Vieux qui implemente l'interface Manger
 * @author hp
 */
public class Vieux implements Manger {

	@Override
	/**
	 * methode redefinit qui retourn une chaine de carteres
	 * @return chaine de carateres
	 */
	public String manger() {
		return "soupe";
	}

}
