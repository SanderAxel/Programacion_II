/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_I;

/**
 *
 * @author Casa
 */
public class Juego {
    protected
        int numeroDeVidas;
        int record;
        
    public Juego(int numeroDeVidas, int record) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = record;
    }

    public Juego() {
    }
    
    public void reiniciaPartida(){
        this.numeroDeVidas = 3;
        this.record = 0;
    }
    public void actualizaRecord(){
        this.record+=1;
    }
    public boolean quitaVida(){
        this.numeroDeVidas-=1;
        if(this.numeroDeVidas >= 1){
            return true;
        }
        else{
            return false;
        }
    }
}
