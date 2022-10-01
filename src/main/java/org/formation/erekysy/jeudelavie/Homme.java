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
			case 5:{
				setNut(new Enfant());
				break;
			}
			case 13:{
				setNut(new Adolescent());
				break;
			}
			case 30:{
				setNut(new Adulte());
				break;
			}
			case 70:{
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
