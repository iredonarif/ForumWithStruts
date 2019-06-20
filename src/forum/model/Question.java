package forum.model;
import java.io.*;
import java.util.*;

public class Question implements Serializable{
	private int id;
	private String texte;
	private Date date;
	private int id_personne; 
	private int id_categorie;

	public Question(){

	}
	public Question(int id, String texte, Date date, int id_personne, int id_categorie){
		this.id = id;
		this.texte = texte;
		this.date = date;
		this.id_personne = id_personne;
		this.id_categorie = id_categorie;
	}
	//-------------------------
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	//-------------------------

	public void setTexte(String texte){
		this.texte = texte;
	}
	public String getTexte(){
		return texte;
	}
	//-------------------------

	public void setDate(Date laDate){
		this.date = laDate;
	}
	public Date getDate(){
		return this.date;
	}
	//-------------------------

	public void setId_personne(int idpers){
		this.id_personne = idpers;
	}
	public int getId_personne(){
		return this.id_personne;
	}
	//-------------------------

	public void setId_categorie(int id_categorie){
		this.id_categorie = id_categorie;
	}
	public int getId_categorie(){
		return this.id_categorie;
	}
	//-------------------------

	public String toString(){
		return getTexte();
	}
}