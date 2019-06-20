package forum.action;

import forum.dao.*;
import forum.model.*;
import com.opensymphony.xwork2.ActionSupport;
import java.util.*;

public class ForumAction extends ActionSupport{
	private Personne personneBean;
	private Question questionBean;
	private Reponse reponseBean;

	private String[] sexes = {"Masculin", "Féminin"};
	private static ArrayList<Categorie> categories = new ArrayList<Categorie>();
	private static ArrayList<Personne> personnes = new ArrayList<Personne>();
	private static ArrayList<Question> questions = new ArrayList<Question>();
	private static ArrayList<Reponse> reponses = new ArrayList<Reponse>();

	PersonneDAO personneDao = new PersonneDAO(Connexion.getInstance());
	QuestionDAO questionDao = new QuestionDAO(Connexion.getInstance());
	ReponseDAO reponseDao = new ReponseDAO(Connexion.getInstance());

	public String executePersonne(){
		personneDao.create(personneBean);
		return SUCCESS;
	}
	public String executeQuestion(){
		questionDao.create(questionBean);
		return SUCCESS;

	}
	public String executeReponse(){
		reponseDao.create(reponseBean);
		return SUCCESS;

	}
	public String executeAfficheQuest(){
		
		reponses = reponseDao.getListeReponses();
		return SUCCESS;
	}
	public String execute() throws Exception{
		questions = questionDao.getListeQuestions();

		categories = questionDao.getListeCategories();

		personnes = personneDao.getListePersonnes();
		return SUCCESS;
	}

	public String input() throws Exception{
		return INPUT;
	}

//------------------Définition des setters et getters--------------------
	public Personne getPersonneBean(){
		return this.personneBean;
	}
	public void setPersonneBean(Personne personne){
		this.personneBean = personne;
	}

	public Question getQuestionBean(){
		return this.questionBean;
	}
	public void setQuestionBean(Question quest){
		this.questionBean = quest;
	}

	public Reponse getReponseBean(){
		return this.reponseBean;
	}
	public void setReponseBean(Reponse rep){
		this.reponseBean = rep;
	}

	public void setPersonnes(ArrayList<Personne> personnes){
		this.personnes = personnes;
	}
	public ArrayList<Personne> getPersonnes(){
		return this.personnes;
	}

	public void setCategories(ArrayList<Categorie> categories){
		this.categories = categories;
	}
	public ArrayList<Categorie> getCategories(){
		return this.categories;
	}

	public void setQuestions(ArrayList<Question> questions){
		this.questions = questions;
	}
	public ArrayList<Question> getQuestions(){
		return this.questions;
	}
	
	public void setReponses(ArrayList<Reponse> reponses){
		this.reponses = reponses;
	}
	public ArrayList<Reponse> getReponses(){
		return this.reponses;
	}

	public String[] getSexes(){
		return sexes;
	}
 }