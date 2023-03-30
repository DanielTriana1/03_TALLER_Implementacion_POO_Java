package Principal;
import Salud.Persona;
import Salud.Empleado;
// import java.util.Scanner;
public class Inicio{
    public static void main(String[] args) {
      //  Double peso,estatura,pesoActual;
        Persona humano = new Persona();
        Empleado humano1 = new Empleado();
        humano.pedirDatos();
        humano1.horastrabajadas();
        humano.mostrarPersona();
        humano1.mostrarDatos();  
        humano1.pagoTotal(); 
      /*  Scanner captura = new Scanner (System.in);
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
        } */
        //humano.calcularImc(); 
        humano.mayorEdad(); 
    }
}