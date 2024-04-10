/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Asus
 */
public class Empleado extends Persona {
    double salario;

    public Empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }

   
}