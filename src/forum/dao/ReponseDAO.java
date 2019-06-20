package forum.dao;

import forum.model.*;
import java.util.*;
import java.sql.*;

public class ReponseDAO extends DAO<Reponse> {

	public ReponseDAO(Connection conn){
        super(conn); 
    }
    
    @Override
    public boolean create(Reponse obj){
    	int nb=0;
		try {
            nb = this.connect.createStatement().executeUpdate("INSERT INTO Reponse(texte, id_question, id_personne)"
            +"VALUES("+ "'"+obj.getTexte()+"',"+obj.getId_question()+","+obj.getId_personne()+")");    
            System.out.println("\nla Reponse est enrégistrée "); 
        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return (nb==1);
    }

    @Override
    public boolean delete(Reponse obj){
    	return true;
    }

    @Override
    public boolean update(Reponse obj){
    	return true;
    }

    @Override
    public Reponse find(int id){
    	Reponse rep = new Reponse();
        try{
            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Reponse WHERE id = "+id);
            if (result.first()) {
                rep = new Reponse(result.getInt(1),result.getString(2), result.getDate(3), result.getInt(4), result.getInt(5));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return rep;
    }

    //retourne la liste de toutes les Reponses
    public ArrayList<Reponse> getListeReponses(){
        ArrayList<Reponse> listeReponses = new ArrayList<Reponse>();
        try{
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM Reponse" );
            while(result.next()){
                listeReponses.add(new Reponse(result.getInt(1),result.getString(2), result.getDate(3), result.getInt(4), result.getInt(5)));
            }
        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return listeReponses;
    }
}