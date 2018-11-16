/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetopersona;

import java.util.Scanner;

/**
 *
 * @author dra69
 */
public class Objetopersona {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Persona david= new Persona("nombre", 0,'H');
    Persona omella= new Persona("nombre", 0,'H');
    Persona ivan= new Persona("nombre",0,'H');
    Persona vPersona[]= new Persona[3];
    vPersona[0]= david;
    vPersona[1]= omella;
    vPersona[2]= ivan;
    /*for(persona aux: vPersona)*/  
    Scanner leer;
    
     System.out.println("introduzca en el siguiente orden:\n nombre, edad, sexo 'H'o'M'");
     leer = new Scanner(System.in);
       
     Persona personaAuxiliar=new Persona(leer.nextLine(),leer.nextInt(),leer.next().charAt(0));
      guardarPersona(vPersona, personaAuxiliar);
      for (Persona aux:vPersona)
            System.out.println(aux);
    }   

    private static void guardarPersona(Persona[] vPersona, Persona personaAuxiliar) {
        for (int i = 0; i < vPersona.length; i++) {
            if (vPersona.equals(null)) {
                vPersona[i]=personaAuxiliar;
            }
        }
    }
   
    
    }
    

