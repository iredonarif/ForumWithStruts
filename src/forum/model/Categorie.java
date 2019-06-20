package forum.model;
import java.io.*;
import java.util.*;

public class Categorie{

	public int id;
	public String nom;

	public Categorie(){
		
	}

	public Categorie(int id, String nom){
		this.id = id;
		this.nom = nom;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public String getNom(){
		return nom;
	}

	public String toString(){
		return getNom();
	}
}