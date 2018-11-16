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
public class Parking {
private int plazas;
private Coche[] vPlazas;

public Parking(){
plazas=50;
vPlazas=new Coche[plazas];
}
public void aparcarCoche(Coche c){}
public void retirar(Coche c){}
public int contarPlazasLibre(){int libre=0;
return libre;}

}
