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
public class OggettoFactory {
    
        
    private static OggettoFactory singleton;

    public static OggettoFactory getInstance() {
        if (singleton == null) {
            singleton = new OggettoFactory();
        }
        return singleton;
    }
    
    private OggettoFactory() {

    }
    
    public ArrayList<Oggetto> getOggettoList(){
        
        ArrayList<Oggetto> OggettoList = new ArrayList<> ();
        
        /* oggetto 0
        
        */
        
        Oggetto oggetto0 = new Oggetto ();
        oggetto0.setQuantità(7);
        oggetto0.setId(10);
        oggetto0.setVenditoreId(7);
        oggetto0.setPrezzo(149.99);
        oggetto0.setNome("Set di chips");
        oggetto0.setUrl("./img/chips.jpg");
        oggetto0.setDescrizione("generico");
        OggettoList.add(oggetto0);
        
        /* oggetto 1
        
        */
        
        Oggetto oggetto1 = new Oggetto ();
        oggetto1.setQuantità(0);
        oggetto1.setId(11);
        oggetto1.setVenditoreId(7);
        oggetto1.setPrezzo(0);
        oggetto1.setNome("Donna dell'est");
        oggetto1.setUrl("./img/donne.jpg");
        oggetto1.setDescrizione("generico");
        OggettoList.add(oggetto1);
        /* oggetto 2
        
        */
        
        Oggetto oggetto2 = new Oggetto ();
        oggetto2.setQuantità(5);
        oggetto2.setId(12);
        oggetto2.setVenditoreId(7);
        oggetto2.setPrezzo(99.99);
        oggetto2.setNome("Mazzo di carte");
        oggetto2.setUrl("./img/cards.jpg");
        oggetto2.setDescrizione("generico");
        OggettoList.add(oggetto2);
        /* oggetto 3
        
        */
        
        Oggetto oggetto3 = new Oggetto ();
        oggetto3.setQuantità(6);
        oggetto3.setId(13);
        oggetto3.setVenditoreId(7);
        oggetto3.setPrezzo(299.99);
        oggetto3.setNome("Tavolo da poker");
        oggetto3.setUrl("./img/tavolo.jpg");
        oggetto3.setDescrizione("generico");
        OggettoList.add(oggetto3);
        /* oggetto 4
        
        */
        
        Oggetto oggetto4 = new Oggetto ();
        oggetto4.setQuantità(0);
        oggetto4.setId(14);
        oggetto4.setVenditoreId(7);
        oggetto4.setPrezzo(499.99);
        oggetto4.setNome("Pistola contro i bari");
        oggetto4.setUrl("./img/pistola.jpg");
        oggetto4.setDescrizione("generico");
        OggettoList.add(oggetto4);
        /* oggetto 5
        
        */
        
        Oggetto oggetto5 = new Oggetto ();
        oggetto5.setQuantità(2);
        oggetto5.setId(15);
        oggetto5.setVenditoreId(7);
        oggetto5.setPrezzo(999.99);
        oggetto5.setNome("Slot machine");
        oggetto5.setUrl("./img/slot.jpg");
        oggetto5.setDescrizione("generico");
        OggettoList.add(oggetto5);
        
        return OggettoList;
    }
    
     public Oggetto getoggettoById(int id){
        ArrayList<Oggetto> OggettoList = this.getOggettoList();
        for( Oggetto  oggetto: OggettoList){
            if(oggetto.getId() == id){
                return oggetto;
            }
        }
        return null;
    }
    
}



