package Salud;
import java.util.Scanner;
public class Persona {
    private String tipoDoc, nombre, apellido,sexo;
    private int edad,documento;
   // private Double estatura,peso,pesoActual;
    public Persona(){

    }
    public Persona(String nombre2, String apellido2, String sexo2, int edad2, String tipoDoc2, int documento2) {
    }
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
      /*   System.out.println("Por favor digite su peso");
        peso=captura.nextDouble();
        System.out.println("Por favor digite su estatura");
        estatura=captura.nextDouble(); */

    }

    
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    

    public void mostrarPersona() {
        System.out.println("Su nombre "+getNombre());
        System.out.println("Su apellido "+getApellido());
        System.out.println("Su sexo "+getSexo());
        System.out.println("Su edad "+getEdad());
        System.out.println("su tipo de documento "+getTipoDoc());
        System.out.println("Su documento "+getDocumento());

      /*  System.out.println("Su nombre "+nombre);
        System.out.println("Su apellido "+apellido);
        System.out.println("Su sexo "+sexo);
        System.out.println("Su edad "+edad);
        System.out.println("su tipo de documento "+tipoDoc);
        System.out.println("Su documento "+documento);
        System.out.println("su peso "+peso);
        System.out.println("Su estatura "+estatura);*/
        
    }

    /*public void calcularImc() {
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
    }*/
   /*  public Double calcularImc(Double peso, Double estatura){
        pesoActual=peso/(estatura*estatura);
        return pesoActual;
    }*/
    public void mayorEdad() {
        if (edad>18){
            System.out.println("eres mayor de edad");
        }
        else {
            System.out.println("eres menor de edad");
        }
    }
}