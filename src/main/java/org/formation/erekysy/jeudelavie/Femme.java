package org.formation.erekysy.jeudelavie;
/**
 * 
 * @author hp
 *
 */
public class Femme extends Personne{
	
	public Femme(String nom) {
		super(nom);
	}
	public void vieilleir() {
		setAge(getAge()+1);
		switch(getAge()) {
			case 4:{
				setNut(new Enfant());
			}
			case 13:{
				setNut(new Adolescent());
			}
			case 18:{
				setNut(new Adulte());
			}
			case 40:{
				setNut(new Vieux());
			}
		}
	}
}
