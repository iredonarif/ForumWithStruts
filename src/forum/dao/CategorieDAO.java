package forum.dao;

import forum.model.*;
import java.util.*;
import java.sql.*;

public class CategorieDAO extends DAO<Categorie> {

	public CategorieDAO(Connection conn){
        super(conn); 
    }
    
    @Override
    public boolean create(Categorie obj){
        return true;
    }

    @Override
    public boolean delete(Categorie obj){
    	return true;
    }

    @Override
    public boolean update(Categorie obj){
    	return true;
    }

    @Override
    public Categorie find(int id){
        Categorie cat = new Categorie();
    	try{
            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Categorie WHERE id = "+id);
            if (result.first()) {
                cat = new Categorie(result.getInt(1),result.getString(2));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return cat;
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

}