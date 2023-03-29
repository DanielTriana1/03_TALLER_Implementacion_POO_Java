package Principal;

import java.util.Scanner;

import Salud.Persona;

public class Inicio{
    public static void main(String[] args) {
       Double peso,estatura,pesoActual;
        Persona humano = new Persona();

           humano.pedirDatos();

        
         Scanner captura = new Scanner (System.in);
        System.out.println("Por favor digite su peso");
        peso=captura.nextDouble();
        System.out.println("Por favor digite su estatura");
        estatura=captura.nextDouble();
        humano.mostrarPersona(); 
        pesoActual=humano.calcularImc(peso,estatura); 
        
        if (pesoActual<20){
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if (pesoActual<=25){
            System.out.println("El peso es ideal");
        }
        else{
            System.out.println("tiene sobrepeso");
        } 
       // humano.calcularImc();
        humano.mayorEdad(); 
        
    }

    
}