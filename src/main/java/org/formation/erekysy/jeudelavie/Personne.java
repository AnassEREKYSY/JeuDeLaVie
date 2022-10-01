package org.formation.erekysy.jeudelavie;
/**
 * 
 * @author hp
 *
 */
public class Personne {
	private String nom;
	private int age;
	private Manger nut;
	public Personne() {
		this("xxxxxx");
	}
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
	public String getInfo() {
		return "Nom: "+getNom()+" Age: "+getAge();
	}

}
