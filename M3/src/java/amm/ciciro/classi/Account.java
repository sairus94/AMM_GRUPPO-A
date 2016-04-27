/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.ciciro.classi;

/**
 *
 * @author Ciro
 */
public class Account {
    
     private int Id;
     private double soldi; 

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the soldi
     */
    public double getSoldi() {
        return soldi;
    }

    /**
     * @param soldi the soldi to set
     */
    public void setSoldi(double soldi) {
        this.soldi = soldi;
    }
}