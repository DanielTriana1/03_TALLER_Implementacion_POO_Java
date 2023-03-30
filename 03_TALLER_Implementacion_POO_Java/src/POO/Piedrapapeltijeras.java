package POO;
import java.util.Scanner;
public class Piedrapapeltijeras implements Juego {
    int numero = (int)(Math.random()*3+1);
    private String eleccion, nomb;
    Scanner captura = new Scanner (System.in);
    
    public void iniciar() {
         System.out.println("Por favor digite su nombre");
        nomb=captura.next();
    }

    public void jugar(){
        System.out.println("por favor digite su eleccion ¿piedra, papel o tijera?");
        eleccion=captura.next();
    }
    public void finalizar(){
        switch (eleccion){
            case "piedra":
            if(numero==1){
                System.out.println("La opcion aleatoria fue: "+numero);         
                System.out.println(nomb+" fue un empate");
            }
            else if(numero==2){
                System.out.println("La opcion aleatoria fue: "+numero);         
                System.out.println("lo sentimos "+nomb+" perdiste");
            }
            else{
                System.out.println("La opcion aleatoria fue: "+numero);         
                System.out.println("Enhorabuena "+nomb+" ganaste");
            }
            break;

            case "papel":
            if(numero==1){
                System.out.println("La opcion aleatoria fue: "+numero);         
                
                System.out.println("Enhorabuena "+nomb+" ganaste");
            }
            else if(numero==2){
                System.out.println("La opcion aleatoria fue: "+numero);         
                
                System.out.println(nomb+" fue un empate");
            }
            else{
                System.out.println("La opcion aleatoria fue: "+numero);         
                System.out.println("lo sentimos "+nomb+" perdiste");
            }
            break;

            case "tijera":
            if(numero==1){
                System.out.println("La opcion aleatoria fue: "+numero);         
                System.out.println("lo sentimos "+nomb+" perdiste");
            }
            else if(numero==2){
                System.out.println("La opcion aleatoria fue: "+numero);         
                System.out.println("Enhorabuena "+nomb+" ganaste");
            }
            else{
                System.out.println("La opcion aleatoria fue: "+numero);         
                System.out.println(nomb+" fue un empate");
            }
            break;


            default:
            System.out.println(nomb+" no es una opcion valida.");
            break;
        }
    
     }
    }



