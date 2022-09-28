package org.formation.erekysy.jeudelavie;

public class Personne {
	private String nom;
	private int age;
	private Manger nut;
	public Personne() {
		
	}
	public Personne(String nom) {
		this.nom=nom;
		this.age=0;
		this.nut= new Bebe();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Manger getNut() {
		return nut;
	}
	public void setNut(Manger nut) {
		this.nut = nut;
	}

}
