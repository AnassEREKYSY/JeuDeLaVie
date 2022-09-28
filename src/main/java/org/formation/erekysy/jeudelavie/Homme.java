package org.formation.erekysy.jeudelavie;
/**
 * 
 * @author hp
 *
 */
public class Homme extends Personne{
	
	public Homme(String nom) {
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
			case 30:{
				setNut(new Adulte());
			}
			case 70:{
				setNut(new Vieux());
			}
		}
	}
	
}
