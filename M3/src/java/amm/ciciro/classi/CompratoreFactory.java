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
public class CompratoreFactory {
    
    private static CompratoreFactory singleton;
    
    
    
    
    public static CompratoreFactory getInstance() {
        if (singleton == null) {
            singleton = new CompratoreFactory();
        }
        return singleton;
    }

    private CompratoreFactory () {
    
}
    
    public ArrayList<Compratore> getCompratoreList(){
        
        ArrayList<Compratore> CompratoreList = new ArrayList<> ();
        
        Compratore compratore0 = new Compratore();
        compratore0.setId(1);
        compratore0.setNome("Gigi");
        compratore0.setCognome("Mereu");
        compratore0.setUsername("Gimmy");
        compratore0.setPassword("aa");
        CompratoreList.add(compratore0);
        
        Compratore compratore1 = new Compratore();
        compratore1.setId(2);
        compratore1.setNome("gabriele");
        compratore1.setCognome("piras");
        compratore1.setUsername("eldiablo");
        compratore1.setPassword("bb");
        CompratoreList.add(compratore1);
       
        return CompratoreList;
    }
    
    public Compratore getcompratoreById(int id){
        ArrayList<Compratore> CompratoreList = this.getCompratoreList();
        for(Compratore compratore : CompratoreList){
            if(compratore.getId() == id){
                return compratore;
            }
        }
        return null;
    }
    
}
