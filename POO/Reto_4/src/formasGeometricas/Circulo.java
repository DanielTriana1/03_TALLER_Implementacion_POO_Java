package formasGeometricas;

public class Circulo extends Figura {
    float radio;

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
        area=3.1416*(radio*radio);
        System.out.println("el radio del circulo es: "+radio+" y su área es: "+area);
    }
}
