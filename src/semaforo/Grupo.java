/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

/**
 *
 * @author ara_b
 */
public class Grupo extends Persona{
    private int cantidad;
    
    public void esperar(){
        System.out.println("Esperando");
    }
    
    public void entrar(){
        System.out.println("Entrando");
    }
    
    public void consumir(){
        System.out.println("Consumiendo");
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
