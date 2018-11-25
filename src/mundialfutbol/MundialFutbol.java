/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class MundialFutbol {

    int totalGrupos;
    int totalEquiposXGrupo;
    int contadorEquipos;
    List<Grupo> grupos;
    Nodo<Hoja> arbol;
    
    
    public static final Comparator<Equipo> comparadorEquipo = (Equipo o1, Equipo o2) -> {
        Double d1 = (o1.golesDiferencia/100.0);
        Double d2 = (o2.golesDiferencia/100.0);
        if(d1<0) d1 = 0.0;
        if(d2<0) d1 = 0.0;
        return Double.compare(o2.puntosTotales + d2, o1.puntosTotales + d1);
    };
    
    public MundialFutbol(int totalGrupos, int totalEquiposXGrupo) {
        
        this.totalGrupos = totalGrupos;
        this.totalEquiposXGrupo = totalEquiposXGrupo;
        this.contadorEquipos = 0;
        
        grupos = new ArrayList<Grupo>();
        
        for (int i = 0; i < totalGrupos; i++) {
            Grupo grupo = new Grupo("G"+ (i+1));
            this.grupos.add(grupo);
        }
        
        for (int i = 0; i < this.totalGrupos; i++) {
            for (int j = 0; j < this.totalEquiposXGrupo; j++) {
                this.contadorEquipos++;
                Equipo equipo = new Equipo("E" + (this.contadorEquipos));
                this.grupos.get(i).AdicionarEquipo(equipo);
            }
        }
        
        for (int i = 0; i < this.grupos.size(); i++) {
            this.grupos.get(i).MostrarGrupo();
        }
    }
    
    public void SimularGrupos(){
        for (int i = 0; i < grupos.size(); i++) {
            grupos.get(i).Simular();
            grupos.get(i).MostrarTabla();
            grupos.get(i).MostrarResultados();
        }
    }
    
    public void InicioSegundaFase(){
        
        List<Equipo> equiposClasificados = new ArrayList<>();
        
        for (int i = 0; i < this.totalGrupos; i++) {
            Collections.sort(grupos.get(i).equipos, this.comparadorEquipo);
            for (int j = 0; j < this.totalEquiposXGrupo/2; j++) {
                equiposClasificados.add(grupos.get(i).equipos.get(j));
            }
        }
        
        int recorreEquipoList = 1;
        this.arbol = new Nodo<Hoja>(new Hoja(1, equiposClasificados.get(0)));
        for (int i = 2; i < this.contadorEquipos; i++) {
            if( i % 2 == 1){ //impar
                arbol.add_nodo(new Hoja (i, equiposClasificados.get(recorreEquipoList)), arbol);
                recorreEquipoList++;
            }else{
                arbol.add_nodo(new Hoja (i), arbol);
            }
        }
        
        System.out.println("");
        arbol.getInorder(arbol);
        System.out.println("");
        
        System.out.println(arbol.info.nombre);
        //System.out.println(arbol.izquierdo.info.nombre);
        //System.out.println(arbol.derecho.info.nombre);
    }
    
    public void SimularSegundaFase(){
        //while(arbol.info.equipo)
    }
    
}
