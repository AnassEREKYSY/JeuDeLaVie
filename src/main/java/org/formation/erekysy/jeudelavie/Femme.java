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
			case 5:{
				setNut(new Enfant());
				break;
			}
			case 13:{
				setNut(new Adolescente());
				break;
			}
			case 18:{
				setNut(new Adulte());
				break;
			}
			case 40:{
				setNut(new Vieux());
				break;
			}
		}
	}
	public String getInfo() {
		String[] str=getNut().getClass().getName().split("\\.");
		return str[4]+" "+super.getInfo()+" Manger: "+getNut().manger();
	}
}
