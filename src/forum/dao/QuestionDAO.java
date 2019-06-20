package forum.dao;

import forum.model.*;
import java.util.*;
import java.sql.*;

public class QuestionDAO extends DAO<Question> {

	public QuestionDAO(Connection conn){
        super(conn); 
    }
    
    @Override
    public boolean create(Question obj){
    	int nb=0;
		try {
            nb = this.connect.createStatement().executeUpdate("INSERT INTO question(texte, id_personne, id_categorie)"
            +"VALUES("+ "'"+obj.getTexte()+"',"+obj.getId_personne()+","+obj.getId_categorie()+")");    
            System.out.println("\nla question est enrégistrée "); 
        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return (nb==1);
    }

    @Override
    public boolean delete(Question obj){
    	return true;
    }

    @Override
    public boolean update(Question obj){
    	return true;
    }

    @Override
    public Question find(int id){
        Question quest = new Question();
    	try{
            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Question WHERE id = "+id);
            if (result.first()) {
                quest = new Question(result.getInt(1),result.getString(2), result.getDate(3), result.getInt(4), result.getInt(5));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return quest;
    }

    //retourne la liste de toutes les catégories
    public ArrayList<Categorie> getListeCategories(){
        ArrayList<Categorie> listeCategories = new ArrayList<Categorie>();
        try{
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM Categorie" );
            while(result.next()){
                listeCategories.add(new Categorie(result.getInt(1),result.getString(2)));
            }
        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return listeCategories;
    }

    //retoune la liste de toutes les questions
    public ArrayList<Question> getListeQuestions(){
        ArrayList<Question> listeQuestions = new ArrayList<Question>();
        try{
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM Question" );
            while(result.next()){
                listeQuestions.add(new Question(result.getInt(1),result.getString(2), result.getDate(3), result.getInt(4), result.getInt(5)));
            }
        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return listeQuestions;
    }
}