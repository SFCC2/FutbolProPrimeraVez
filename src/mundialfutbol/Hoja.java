/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

/**
 *
 * @author Sulay2016
 */
public class Hoja {
    public int nombre;
    Equipo equipo;

    public Hoja(int nombre) {
        this.nombre = nombre;
        this.equipo = null;
    }
    
    public Hoja(int nombre, Equipo equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }
    
    @Override
    public String toString(){
        String result =  "" +this.nombre;
        if(this.equipo != null){
            result += "(" + equipo.Nombre + ")";
        }
        return result;
    }
    
    @Override
    public boolean equals(Object other){
        Hoja otherHoja = (Hoja) other;
        if(otherHoja.nombre <= this.nombre){ 
            return true;
        }else{
            return false;
        }
    }
    
    
}
