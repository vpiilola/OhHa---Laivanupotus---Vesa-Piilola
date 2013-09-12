package laivanupotus;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vpiilola
 */
public class Pelaaja {
    private String name;
    
    public Pelaaja(String nimi){    //halutaa siis luoda kaksi pelaajaa jokaista
        this.name=nimi;             //peliä kohti
    }
    
    public String getNimi(){        //getteri jota myöhemmin sovellus varmaan
        return this.name;           // haluaa käyttää
    }
    
    public void asetaLaiva(){
        
    }
    
    public void ammu(int x, int y){ //ampuu pelilaudan koordinaattiin (x,y)
        
    }
    
    
}
