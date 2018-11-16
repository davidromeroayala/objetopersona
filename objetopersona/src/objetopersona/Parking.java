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
private final int PLAZAS;
private Coche[] vPlazas;

public Parking(){
PLAZAS=50;
vPlazas=new Coche[PLAZAS];
}

public void aparcarCoche(Coche c){
    for (int i = 0; i < vPlazas.length; i++) {
        if (vPlazas==null) {
            vPlazas[i]=c;
            break;
        }
    }
}
public void retirar(Coche c){ for (int i = 0; i < vPlazas.length; i++) {
        if (vPlazas[i]!=null && vPlazas[i].getMatricula().equals(c.getMatricula())) {
            vPlazas[i]=null;
            break;
        }
    }}
public int contarPlazasLibre(){
    int libre=0;
for(Coche aux: vPlazas)
    if (aux==null)
    libre++;
return libre;}

}
