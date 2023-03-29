package Principal;

import Salud.Persona;

public class Inicio{
    public static void main(String[] args) {
        Persona humano = new Persona();
        humano.pedirDatos();
        humano.mostrarPersona();
        pesoActual=humano.calcularImc(peso,estatura); 
        humano.mayorEdad(); 
    }
}