package org.formation.erekysy.jeudelavie;
/**
 * classe Adolescent qui implemente l'interface Manger
 * @author hp
 */
public class Adolescent implements Manger {
	
	
	@Override
	/**
	 * methode redefinit qui retourn une chaine de carteres
	 * @return chaine de carateres
	 */
	public String manger() {
		return "Macdo";
	}

}
