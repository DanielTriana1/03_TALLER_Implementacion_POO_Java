package formasGeometricas;

    public class Rectangulo extends Figura {
        float base, altura;

        public Rectangulo(float base, float altura) {
            this.base = base;
            this.altura = altura;
        }
        public float getBase() {
            return base;
        }

        public void setBase(float base) {
            this.base = base;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public void calcularArea(){
            float area;
            area=base*altura;
            System.out.println("la base del rectangulo es: "+base+", su altura es: "+altura+" y su área es: "+area);
        }
}
