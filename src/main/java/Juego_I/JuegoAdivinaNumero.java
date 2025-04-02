/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_I;
import java.util.Scanner;
/**
 *
 * @author Casa
 */
public class JuegoAdivinaNumero extends Juego {
    private 
        int numeroAAdivinar;
    public JuegoAdivinaNumero(){
        super.numeroDeVidas = 3;
    }
    public boolean validaNumero(int a){
        if(a>=0 && a<=10){
            return true;
        }
        else return false;
    }
    public void Juega(){
        reiniciaPartida();
        this.numeroAAdivinar = (int)(Math.random()*11);
        boolean sw = true;
        Scanner usuario = new Scanner(System.in);
        
        while(sw==true){
            System.out.println("Ingrese un numero: ");
            int numero = usuario.nextInt();
            if(validaNumero(numero)==true){
                if(this.numeroAAdivinar == numero){
                    System.out.println("Acertaste!!");
                    actualizaRecord();
                    this.numeroAAdivinar = (int)(Math.random()*11);
                }

                else{

                    if(quitaVida()==true){
                        if(numero > this.numeroAAdivinar){
                                System.out.println("Intentanlo de nuevo, tu numero es mayor que el numero de elegido por la maquina");

                        }
                        else{
                            System.out.println("Intentanlo de nuevo, tu numero es menor que el numero de elegido por la maquina");
                        }
                    }
                    else{
                        sw=false;
                    }
                }
            }
            else{
                System.out.println("¡ERROR! Ingrese un numero entre 0 y 10");
            }    
        }
        if(super.record >0){
            System.out.println("Record: "+super.record);
            System.out.println("Fin del juego");
        }
        else{
            System.out.println("Fin del juego");
        }
        
    }
}
