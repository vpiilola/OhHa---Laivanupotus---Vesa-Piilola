/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus;

/**
 *
 * @author vpiilola
 */
public class Laiva {
    private int pituus;
    private boolean onkoUponnut;
    private int kunto =this.pituus;
    
    public Laiva(int koko){         //luodaan uusi laivaolio
        this.pituus=koko;
        this.onkoUponnut=false;
    }
    
    public int Osuma(){
        this.kunto=this.kunto-1;
        
        return this.kunto;
    }
    
    public boolean Upposiko(){      //metodi, jota -metodi kutsuu
        this.kunto=this.kunto -1;
        
        if (this.kunto==0){
            onkoUponnut=true;
        }
        
        return onkoUponnut;
    }
    
}
