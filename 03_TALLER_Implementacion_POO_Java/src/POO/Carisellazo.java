package POO;
import java.util.Scanner;
public class Carisellazo implements Juego {
            int numero = (int)(Math.random()*2+1);
    private String eleccion, nomb;
    Scanner captura = new Scanner(System.in);
    public void iniciar() {
        System.out.println("Por favor digite su nombre");
        nomb=captura.next();
    }

    public void jugar() {
        System.out.println("por favor digite su eleccion ¿cara o sello?");
        eleccion=captura.next();
    }

    public void finalizar() {
        switch (eleccion){
            case "cara":
            if(numero==1){
                System.out.println("La opcion aleatoria fue: "+numero+". Cara");         
                System.out.println("Enhorabuena "+nomb+" ganaste");
            }
            else{
                System.out.println("La opcion aleatoria fue: "+numero);         
                System.out.println("lo sentimos "+nomb+" perdiste");
            }
            break;
    
            case "sello":
            if(numero==2){
                System.out.println("La opcion aleatoria fue: "+numero+". Sello");         
                System.out.println("Enhorabuena "+nomb+" ganaste");
            }
            else{
                System.out.println("La opcion aleatoria fue: "+numero);         
                
                System.out.println("lo sentimos "+nomb+" perdiste");
                
            }
     
            break;
    
            default:
            System.out.println(nomb+" no es una opcion valida.");
            break;
        }
    }

   

}
