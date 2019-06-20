package forum.model;
import java.io.*;
import java.util.*;

public class Personne implements Serializable{
	
	private int id;
	private String nom, prenom, email, sexe;
	private Date dateNaissance;

	public Personne(){
	
	}
	public Personne(int id, String nom, String pre, String sexe, Date date, String email){
		this.id = id;
		this.nom = nom;
		this.prenom = pre;
		this.sexe = sexe;
		this.dateNaissance = date;
		this.email = email;
		
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
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	public String getPrenom(){
		return prenom;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getSexe(){
		return this.sexe;
	}
	public void setDateNaissance(Date date){
		this.dateNaissance = date;
	}
	public Date getDateNaissance(){
		return this.dateNaissance;
	}

	public String toString(){
		return getNom()+" "+getPrenom();
	}
}