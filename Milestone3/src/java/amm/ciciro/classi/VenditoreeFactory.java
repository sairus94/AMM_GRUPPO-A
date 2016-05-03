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
public class VenditoreeFactory {
    
    
    private static VenditoreeFactory singleton;

    public static VenditoreeFactory getInstance() {
        if (singleton == null) {
            singleton = new VenditoreeFactory();
        }
        return singleton;
    }
    
    private VenditoreeFactory (){
        
    }
    
    public ArrayList<Venditoree> getVenditoreList (){
        
        ArrayList<Venditoree> venditoreList = new ArrayList<>  ();
        
        
        Venditoree venditore0 = new Venditoree ();
        venditore0.setUserId(100);
        venditore0.setNome("Babbo");
        venditore0.setCognome("Natale");
        venditore0.setUsername("babbo");
        venditore0.setPassword("cc");
        venditoreList.add(venditore0);
        
        Venditoree venditore1 = new Venditoree ();
        venditore1.setUserId(101);
        venditore1.setNome("Andrea");
        venditore1.setCognome("Casti");
        venditore1.setUsername("aereo");
        venditore1.setPassword("plano");
        venditoreList.add(venditore1);
        
        return venditoreList; 
    }
    
    public Venditoree getVenditoreById(int id){
        ArrayList<Venditoree> VenditoreList = this.getVenditoreList();
        for( Venditoree venditore : VenditoreList){
            if(venditore.getUserId() == id){
                return venditore;
            }
        }
        return null;
    }
}
