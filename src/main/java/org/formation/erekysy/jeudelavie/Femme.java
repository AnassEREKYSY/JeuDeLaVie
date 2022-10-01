package org.formation.erekysy.jeudelavie;
/**
 * la classe Femme hérite de la classe Personne et qui definit le comportement d'une femme avec ces propre caracteristqiue
 * @author hp
 */
public class Femme extends Personne{
	
	/**
	 * Constructeur de la classe Femme
	 * @param nom 
	 */
	public Femme(String nom) {
		super(nom);
	}
	/**
	 * methode veilleir : permet d'ajouter 1 an a lobjet femme chaque fois qu'on l'apelle
	 * elle aussi permet de changer l'attribut nut hértié de la classe Personne selon l'age de la femme
	 */
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
	/**
	 * methode getInfo : permet de retourner les informations de l'objet femme sous forme d'une chaine de caracteres 
	 * @return  une chaine qui contient les informations de l'objet femme
	 */
	public String getInfo() {
		String[] str=getNut().getClass().getName().split("\\.");
		return str[4]+" "+super.getInfo()+" Manger: "+getNut().manger();
	}
}
