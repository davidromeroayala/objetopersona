/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetopersona;

/**
 *
 * @author alumno
 */
public class Persona {
    private final String HOMBRE = "H";
    private final String MUJER = "M";
    private final int PINF = -1;
    private final int PN = 0;
    private final int PO = +1;
    private String nombre; 
    private int edad;
    private String dni;
    private String sexo;
    private int peso;
    private int altura;
    private final boolean ME=false;
    
    
        public Persona() {
            nombre="";
            edad=0;
            dni=generarDNI();

            sexo=HOMBRE;
            peso=0;
            altura=0;

        }

        public Persona(String nombre, int edad, String dni, String sexo, int peso, int altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
        }
        public Persona(String nombre, int edad) {
           this.nombre = nombre;
           this.edad = edad;
           this.dni = dni;
           this.sexo = sexo;
           this.peso = peso;
           this.altura = altura;
        }

            public int calcularIMC(){
            int imc;
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
                    ME=true;
                }else
                    ME=false;
            }
            public void generarDNI(){
            
            }
}


