/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetopersona;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Objetopersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Persona david;
    Persona omella;
    Persona ivan;
    Scanner leer=new Scanner(System.in);
    String nombre;
    int edad;
    char sexo;
    double peso;
    double altura;
        System.out.println("introduzca en el siguiente orden:\n nombre, edad, sexo 'H'o'M', peso, altura");
        nombre=leer.nextLine();
        edad=leer.nextInt();
        sexo=leer.next().charAt(0);
        peso=leer.nextDouble();
        altura=leer.nextDouble();
    david =new Persona(nombre, edad, "124578458G", sexo, peso, altura);
    
    }
    
}
