package org.formation.erekysy.jeudelavie;
/**
 * classe Bebe qui implemente l'interface Manger
 * @author hp
 */
public class Bebe implements Manger {
	
	@Override
	/**
	 * methode redefinit qui retourn une chaine de carteres
	 * @return chaine de carateres
	 */
	public String manger() {
		return "biberon";
	}
}
