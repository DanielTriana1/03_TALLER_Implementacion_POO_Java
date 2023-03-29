package Principal;
import java.util.Scanner;
import formasGeometricas.Cuadrado;
import formasGeometricas.Rectangulo;
import formasGeometricas.Circulo;
import formasGeometricas.Triangulo;
public class Ejecuccion {
    public static void main(String[] args) {
        float base=0, altura=0, lado=0, radio=0;
        int resp;
        Cuadrado Cuad = new Cuadrado (lado);
        Rectangulo Rect = new Rectangulo (base,altura);
        Circulo Cirl = new Circulo(radio);
        Triangulo Tri = new Triangulo(base, altura);
        Scanner captura = new Scanner (System.in);

    do{        
        System.out.println("Por digite cual figura desea encontrar el area: 1.Cuadrado 2.Rectangulo 3.Circulo 4.Triangulo");
        resp=captura.nextInt();
        switch (resp) {
            case 1:
                Cuad.calcularArea();
                break;

                case 2:
                Rect.calcularArea();
                break;

                case 3:
                Cirl.calcularArea();
                break;

                case 4:
                Tri.calcularArea();
                break;
            default:
            System.out.println("Opcion digitada erronea");
                break;
        }
        System.out.println("¿Desea seguir consultando areas de figuras? 1. SI 2. NO");
        resp=captura.nextInt();
}while(resp==1);
    }
}
