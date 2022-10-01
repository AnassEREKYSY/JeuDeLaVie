package org.formation.erekysy.jeudelavie;
/**
 * la classe Homme hérite de la classe Personne et qui definit le comportement d'un homme avec ces propre caracteristqiue
 * @author hp
 */
public class Homme extends Personne{
	/**
	 * Constructeur de la classe Homme
	 * @param nom 
	 */
	public Homme(String nom) {
		super(nom);
	}
	/**
	 * methode veilleir : permet d'ajouter 1 an a lobjet homme chaque fois qu'on l'apelle
	 * elle aussi permet de changer l'attribut nut hértié de la classe Personne selon l'age de l'homme
	 */
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
	/**
	 * methode getInfo : permet de retourner les informations de l'objet homme sous forme d'une chaine de caracteres 
	 * @return  une chaine qui contient les informations de l'objet homme
	 */
	public String getInfo() {
		String[] str=getNut().getClass().getName().split("\\.");
		return str[4]+" "+super.getInfo()+" Manger: "+getNut().manger();
	}
	
}
