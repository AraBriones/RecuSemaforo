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
public class Cadenero extends Persona{
    private int edad;

    public Cadenero() {
    }
    
    public void decirQuienEntr(){
        System.out.println("Entrar ese grupo");
    }
    
    public void dejarEntrar(){
        System.out.println("Puede entrar");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
