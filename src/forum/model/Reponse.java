package forum.model;
import java.io.*;
import java.util.*;

public class Reponse implements Serializable {

	private int id;
	private String texte;
	private Date date;
	private int id_personne; 
	private int id_question;

	public Reponse(){

	}
	public Reponse(int id, String texte, Date date, int id_quest, int id_pers){
		this.id = id;
		this.texte = texte;
		this.date = date;
		this.id_question = id_quest;
		this.id_personne = id_pers;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}

	public void setTexte(String texte){
		this.texte = texte;
	}
	public String getTexte(){
		return texte;
	}
	public void setDate(Date laDate){
		this.date = laDate;
	}
	public Date getDate(){
		return this.date;
	}
	public void setId_personne(int id_pers){
		this.id_personne = id_pers;
	}
	public int getId_personne(){
		return this.id_personne;
	}
	public void setId_question(int id_quest){
		this.id_question = id_quest;
	}
	public int getId_question(){
		return this.id_question;
	}
	public String toString(){
		return "Reponse : "+getTexte();
	}
}