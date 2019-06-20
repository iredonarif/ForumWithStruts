package forum.dao;

import java.sql.*;

public class Connexion {

    private String url = "jdbc:postgresql://localhost:5432/forum";
    private String user = "ogbone";
    private String passwd = "iredon";
    private static Connection connect;
    private Connexion(){
        try {
			Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(url, user, passwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //retourne l'instance et la crée si elle n'existe pas
    public static Connection getInstance(){
        if(connect == null){
            new Connexion();
        }
        return connect;   
   }   
}
