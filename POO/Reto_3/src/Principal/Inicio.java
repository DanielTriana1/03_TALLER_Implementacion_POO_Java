package Principal;



import Salud.Persona;
import Salud.Empleado;

public class Inicio{
    public static void main(String[] args) {

        Persona humano = new Persona();
        Empleado humano1 = new Empleado();
           humano.pedirDatos();
        humano1.horastrabajadas();

        humano.mostrarPersona(); 
        humano1.mostrarDatos();  
        humano1.pagoTotal();     
        

        
    }

    
}