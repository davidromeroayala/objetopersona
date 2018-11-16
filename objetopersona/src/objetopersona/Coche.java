/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetopersona;

/**
 *
 * @author dra69
 */
public class Coche {
    private Persona propietario;
    private int plazas;
    private Persona vOcupantes[];
    private String matricula;

    public Coche(int plazas,  String matricula) {
        this.propietario = new Persona();
        this.plazas = plazas;
        this.vOcupantes = new Persona[plazas];
        this.matricula = matricula;
    }

    public Coche() {
        propietario=new Persona();
        plazas= 5;
        vOcupantes= new Persona[plazas];
        matricula="XXXXXXX";
    }
    
    public void montarPersona(Persona p){
        if (plazasLibres()>0){
        for (int i = 0; i < plazas; i++) {
            if(vOcupantes[i]==null)
                vOcupantes[i]=p;
            System.out.println("montado");
            break;
        }
        }else{
             System.out.println("No hay plazas");   }
        
}
public int plazasLibres(){
int numPlazas=0;
    for (int i = 0; i <plazas; i++) {
        if(vOcupantes[i]==null)
            numPlazas++;
    }
return numPlazas;}

public void desmontarpersona(String p){
    for (int i = 0; i < plazas; i++) {
            if(vOcupantes[i]!=null && vOcupantes[i].getNombre().equals(p)){
                vOcupantes[i]=null;
            
            break;
            }
        }
}
public void desmontarpersona(Persona p){
    for (int i = 0; i < plazas; i++) {
            if(vOcupantes[i]!=null && vOcupantes[i].getNombre().equals(p.getNombre())){
                vOcupantes[i]=null;
            
            break;
            }
        }
}
}
