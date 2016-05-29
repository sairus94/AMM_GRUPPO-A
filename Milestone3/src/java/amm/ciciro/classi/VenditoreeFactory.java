/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.ciciro.classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ciro
 */
public class VenditoreeFactory {
    
    
    private static VenditoreeFactory singleton;
    String connectionString;
    
    public static VenditoreeFactory getInstance() {
        if (singleton == null) {
            singleton = new VenditoreeFactory();
        }
        return singleton;
    }
  
    
    private VenditoreeFactory (){
        
    }
    
     public Venditoree getVenditoree(String username, String password)
    {
      try
        {
            Connection conn = DriverManager
                    .getConnection(connectionString, 
                            "ciro",
                            "ciro");   
            String query = "select * from Venditore where"
                    + "password = ? and username = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, password);
            stmt.setString(2, username);
            
            ResultSet set = stmt.executeQuery();
            
            if(set.next())
            {
        Venditoree venditore = new Venditoree();
        venditore.userId = set.getInt("userId");
        venditore.nome = set.getString("nome");
        venditore.cognome = set.getString("cognome");
        venditore.username = set.getString("username");
        venditore.password = set.getString("password");
        
            stmt.close();
            conn.close();
            return venditore;
            }
            
    }
     catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    
    }
     public Venditoree getVenditoreeById(int userId){
         
          try 
        {
           
            Connection conn = DriverManager.getConnection(connectionString, "ciro", "ciro");
            // Query
            String query = "select * from Venditore "
            + "where userId = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setInt(1, userId);
            // Esecuzione query
            ResultSet res = stmt.executeQuery();
            
             if(res.next()) 
            {
                Venditoree current = new Venditoree();
                current.setId(res.getInt("userId"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setUsername(res.getString("username"));
                current.setPassword(res.getString("password"));
                
                
                stmt.close();
                conn.close();
                return current;
     }
             stmt.close();
             conn.close();
        }
             catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return null;
    }
     public ArrayList<Venditoree> getVenditoreeList()
     {
     ArrayList<Venditoree> venditoreList = new ArrayList <> ();
     
     try 
        {
           
            Connection conn = DriverManager.getConnection(connectionString, "ciro", "ciro");
            Statement stmt = conn.createStatement();
            String query = "select * from Venditore";
            ResultSet set = stmt.executeQuery(query);
            
            while(set.next())
            {
                Venditoree current = new Venditoree();
                
                    current.setId(set.getInt("userId"));
                    current.setNome(set.getString("nome"));
                    current.setCognome(set.getString("cognome"));
                    current.setUsername(set.getString("username"));
                    current.setPassword(set.getString("password"));
                    venditoreList.add(current);
                }
            stmt.close();
            conn.close();
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return venditoreList;
     }
     public void setConnectionString(String s){
	this.connectionString = s;
    }
    public String getConnectionString(){
	return this.connectionString;
    }

   
         }





