package Salud;

import java.util.Scanner;
public class Persona {
    private String tipoDoc, nombre, apellido,sexo;
    private int edad,documento;
    private Double estatura,peso,pesoActual;

    public void pedirDatos() {
        Scanner captura= new Scanner (System.in);
        System.out.println("Por favor digite su nombre");
        nombre=captura.next();
        System.out.println("Por favor digite su apellido");
        apellido=captura.next();
        System.out.println("Por favor digite su sexo");
        sexo=captura.next();
        System.out.println("Por favor digite su edad");
        edad=captura.nextInt();
        System.out.println("Por favor digite su tipo de documento");
        tipoDoc=captura.next();
        System.out.println("Por favor digite su documento");
        documento=captura.nextInt();
        System.out.println("Por favor digite su peso");
        peso=captura.nextDouble();
        System.out.println("Por favor digite su estatura");
        estatura=captura.nextDouble(); 

    }

    public void mostrarPersona() {
        System.out.println("Su nombre "+nombre);
        System.out.println("Su apellido "+apellido);
        System.out.println("Su sexo "+sexo);
        System.out.println("Su edad "+edad);
        System.out.println("su tipo de documento "+tipoDoc);
        System.out.println("Su documento "+documento);
        System.out.println("su peso "+peso);
        System.out.println("Su estatura "+estatura);
        
    }

    public void calcularImc() {
        pesoActual=peso/(estatura*estatura);
        if (pesoActual<20){
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if (pesoActual<=25){
            System.out.println("El peso es ideal");
        }
        else{
            System.out.println("tiene sobrepeso");
        }    
    }

    public void mayorEdad() {
        if (edad>18){
            System.out.println("eres mayor de edad");
        }
        else {
            System.out.println("eres menor de edad");
        }
    }
}