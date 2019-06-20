package forum.dao;

import forum.model.*;
import java.util.*;
import java.sql.*;

public class PersonneDAO extends DAO<Personne> {

	public PersonneDAO(Connection conn){
        super(conn); 
    }
    
    @Override
    public boolean create(Personne obj){
    	int nb=0;
		try {
            nb = this.connect.createStatement().executeUpdate("INSERT INTO Personne(nom, prenom, sexe, datenaissance, email)"
            +"VALUES("+ "'"+obj.getNom()+"','"+obj.getPrenom()+"','" +obj.getSexe()+"','"+obj.getDateNaissance()+"','"+obj.getEmail()+"')");    
            System.out.println("\nla personne est enrégistrée "); 
        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return (nb==1);
    }

    @Override
    public boolean delete(Personne obj){
    	return true;
    }

    @Override
    public boolean update(Personne obj){
    	return true;
    }

    @Override
    public Personne find(int id){
    	Personne pers = new Personne();
    	try{
    		ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Personne WHERE id = "+id);
    		if (result.first()) {
    			pers = new Personne(id, result.getString(2), result.getString(3), result.getString(4), result.getDate(5),
                	result.getString(6));
    		}
    	}
    	catch(SQLException e){
            e.printStackTrace();
    	}
    	return pers;
    }

    public ArrayList<Personne> getListePersonnes(){
    	ArrayList<Personne> listePersonnes = new ArrayList<Personne>();
    	try{
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM Personne" );
            while(result.next()){
            	listePersonnes.add(find(result.getInt(1)));
            }
        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return listePersonnes;
    }
}