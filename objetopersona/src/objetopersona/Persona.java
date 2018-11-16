/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetopersona;

import java.util.Random;

/**
 *
 * @author dra69
 */
public class Persona {
    private final char HOMBRE = 'H';
    private final char MUJER = 'M';
    private final int PINF = -1;
    private final int PN = 0;
    private final int PO = +1;
    private String nombre; 
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private final boolean MAYORE=true;
    private final boolean MENORE=false;
    
    
        public Persona() {
            nombre="";
            edad=0;
            dni=generarDNI();
            sexo=HOMBRE;
            peso=0;
            altura=0;
            
        }

        public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
            comprobarSexo(sexo);
            this.peso = peso;
            this.altura = altura;
        }
        public Persona(String nombre, int edad, char sexo) {
           this.nombre = nombre;
           this.edad = edad;
           this.dni = generarDNI();
           comprobarSexo(sexo);
           this.peso = peso;
           this.altura = altura;
        }

            public int calcularIMC(){
            double imc;
            imc=peso/(altura*altura);
                if (imc<18.5) {
                    return PINF; 
                }else if (imc>30) {
                    return PO;

                }else
                    return PN;

            }
            public boolean esMayorDeEdad(){
                if (edad>=18) {
                    return MAYORE;
                }else{
                    return MENORE;
                }
            }

    public String getNombre() {
        return nombre;
    }
            
            
            
            private String generarDNI(){
                String dni;
                 Random r=new Random();
                 dni="";
                for (int i = 0; i < 8; i++) {
                    dni+=Integer.toString(r.nextInt(10));
                }
                 
                dni+= calcularLetra(dni);
                
                 return dni;
            }
            private String calcularLetra(String dni){
                 String[] vLetras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
                String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
                 int cletra=0;
                String letra="";
                for (int i = 0; i < 8; i++) {
                    cletra+= Integer.parseInt(dni.substring(i,i+1)) ;
                }
              cletra=cletra%23;
               
                letra=vLetras[cletra];
              
                
                return letra;
            }
            private void comprobarSexo(char sexo){
            if (sexo==HOMBRE || sexo==MUJER){
                this.sexo=sexo;
            }else {
                this.sexo=HOMBRE;
            }
                
                }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    
            
}


