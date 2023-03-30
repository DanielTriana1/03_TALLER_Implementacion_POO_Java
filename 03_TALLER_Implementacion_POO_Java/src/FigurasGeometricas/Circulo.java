
package FigurasGeometricas;
import java.util.Scanner;
public class Circulo extends Figura {
    float radio;
    Scanner captura = new Scanner (System.in);
    public Circulo(float radio){
        this.radio=radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void calcularArea(){
        Double area;
        System.out.println("Por favor digite el radio del circulo");
        radio=captura.nextFloat();
        area=3.1416*(radio*radio);
        System.out.println("el radio del circulo es: "+radio+" y su área es: "+area);
    }
}
