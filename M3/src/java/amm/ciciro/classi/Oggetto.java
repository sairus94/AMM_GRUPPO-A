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
public class Oggetto {
    
    private int quantità;
    private int id;
    private int venditoreId;
    private double prezzo;
    private String nome;
    private String url;
    private String descrizione;
    
    public Oggetto(){
    } 
    public Oggetto(int quantità, int id, int venditoreId, double prezzo, String nome, String Url, String descrizione)
    {
        this.quantità = quantità;
        this.id = id;
        this.venditoreId = venditoreId;
        this.prezzo = prezzo;
        this.nome = nome;
        this.url = url;
        this.descrizione = descrizione;
    }

    /**
     * @return the quantità
     */
    public int getQuantità() {
        return quantità;
    }

    /**
     * @param quantità the quantità to set
     */
    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the venditoreId
     */
    public int getVenditoreId() {
        return venditoreId;
    }

    /**
     * @param venditoreId the venditoreId to set
     */
    public void setVenditoreId(int venditoreId) {
        this.venditoreId = venditoreId;
    }

    /**
     * @return the prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * @param descrizione the descrizione to set
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
}