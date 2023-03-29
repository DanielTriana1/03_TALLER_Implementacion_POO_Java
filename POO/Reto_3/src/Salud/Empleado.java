package Salud;

import java.util.Scanner;
public class Empleado extends Persona {
    Scanner captura= new Scanner (System.in);
    private String cargo, departamento;
    private int valorhora, horastrabajadas;
    private Double pagoTot;
  public Empleado (String nombre, String apellido, String sexo, int edad, String tipoDoc, int documento, String cargo, String departamento,int valorhora, int horastrabajadas, Double pagoTot){
    super(nombre,apellido,sexo,edad,tipoDoc,documento);
    this.cargo=cargo;
    this.departamento=departamento;
    this.valorhora=valorhora;
    this.horastrabajadas=horastrabajadas;
    this.pagoTot=pagoTot;
  }
public Empleado(){
}
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
public String getDepartamento() {
    return departamento;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
}
public int getValorhora() {
    return valorhora;
}
public void setValorhora(int valorhora) {
    this.valorhora = valorhora;
}
public int getHorastrabajadas() {
    return horastrabajadas;
}
public void setHorastrabajadas(int horastrabajadas) {
    this.horastrabajadas = horastrabajadas;
}
public Double getPagoTotal() {
    return pagoTot;
}
public void setPagoTotal(Double pagoTot) {
    this.pagoTot = pagoTot;
}


public void horastrabajadas() {
    System.out.println("por favor digite las horas trabajadas");
    horastrabajadas=captura.nextInt();
    System.out.println("por favor digite el valor de la hora");
    valorhora=captura.nextInt();
    System.out.println("por favor digite su cargo");
    cargo=captura.next();
    System.out.println("por favor digite el departamento en le que trabaja");
    departamento=captura.next();
}
public void pagoTotal(){
    pagoTot=horastrabajadas*(valorhora*0.966);
    System.out.println("Su total a pagar "+pagoTot);
}
public void mostrarDatos(){
    /*System.out.println("Su nombre "+getNombre());
    System.out.println("Su apellido "+getApellido());
    System.out.println("Su sexo "+getSexo());
    System.out.println("Su edad "+getEdad());
    System.out.println("su tipo de documento "+getTipoDoc());
 
public Scanner getCaptura() {
    return captura;
}
public void setCaptura(Scanner captura) {
    this.captura = captura;
}
public Scanner getCaptura() {
    return captura;
}
public void setCaptura(Scanner captura) {
    this.captura = captura;
}   System.out.println("Su documento "+getDocumento());*/
    System.out.println("Su cargo "+getCargo());
    System.out.println("Su departamento "+getDepartamento());
}

}