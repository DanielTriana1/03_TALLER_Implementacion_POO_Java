
package FigurasGeometricas;
import java.util.Scanner;
public class Cuadrado extends Figura {
    float lado;
    Scanner captura = new Scanner (System.in);
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    public void calcularArea(){
        float area;
        System.out.println("Por favor digite el lado del cuadrado");
        lado=captura.nextFloat();
        area=lado*lado;
        System.out.println("El lado del cuadrado es: "+lado+" y su área es: "+area);
    }
}
