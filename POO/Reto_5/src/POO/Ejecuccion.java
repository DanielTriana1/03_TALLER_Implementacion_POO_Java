package POO;

public class Ejecuccion {
    public static void main(String[] args) {
        Carisellazo juego1=new Carisellazo();
        Piedrapapeltijeras juego2=new Piedrapapeltijeras();

        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
    }
}
