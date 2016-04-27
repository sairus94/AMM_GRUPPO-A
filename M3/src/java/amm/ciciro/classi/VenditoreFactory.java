/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.ciciro.classi;
import java.util.ArrayList;

/**
 *
 * @author Ciro
 */
public class VenditoreFactory {
    
    
    private static VenditoreFactory singleton;

    public static VenditoreFactory getInstance() {
        if (singleton == null) {
            singleton = new VenditoreFactory();
        }
        return singleton;
    }
    
    private VenditoreFactory (){
        
    }
    
    public ArrayList<Venditore> getVenditoreList (){
        
        ArrayList<Venditore> VenditoreList = new ArrayList<>  ();
        
        
        Venditore venditore0 = new Venditore ();
        venditore0.setUserId(100);
        venditore0.setNome("Babbo");
        venditore0.setCognome("Natale");
        venditore0.setUsername("Claus");
        venditore0.setPassword("renna");
        
        Venditore venditore1 = new Venditore ();
        venditore1.setUserId(101);
        venditore1.setNome("Andrea");
        venditore1.setCognome("Casti");
        venditore1.setUsername("aereo");
        venditore1.setPassword("plano");
        
        return VenditoreList; 
    }
    
    public Venditore getVenditoreById(int id){
        ArrayList<Venditore> VenditoreList = this.getVenditoreList();
        for( Venditore venditore : VenditoreList){
            if(venditore.getUserId() == id){
                return venditore;
            }
        }
        return null;
    }
}
