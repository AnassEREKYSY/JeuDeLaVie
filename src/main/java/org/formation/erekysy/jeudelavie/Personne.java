package org.formation.erekysy.jeudelavie;
/**
 * La classe Personne definit le comportement d'une personne 
 * @author hp
 *
 */
public class Personne {
	private String nom;
	private int age;
	private Manger nut;
	/**
	 * constructeur sans parametres
	 */
	public Personne() {
		this("xxxxxx");
	}
	/**
	 * constructeur avec parametres
	 * @param nom
	 */
	public Personne(String nom) {
		this.nom=nom;
		this.age=0;
		this.nut= new Bebe();
	}
	public int getAge() {
		return age;
	}
	public void	setAge(int age) {
		this.age=age;
	}
	protected Manger getNut() {
		return nut;
	}
	protected void setNut(Manger nut) {
		this.nut = nut;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * methode getInfo : permet de retourner les informations de l'objet personne sous forme d'une chaine de caracteres 
	 * @return  une chaine qui contient les informations de l'objet personne
	 */
	public String getInfo() {
		return "Nom: "+getNom()+" Age: "+getAge();
	}

}
