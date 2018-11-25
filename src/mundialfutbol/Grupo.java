/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sulay2016
 */
public class Grupo {
    String nombre;
    List<Equipo> equipos;
    String[][] tabla;
    int totalEquipos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<Equipo>();
        this.totalEquipos = 0;
    }
    
    public void AdicionarEquipo (Equipo equipo){
        this.equipos.add(equipo);
        this.totalEquipos++;
    }
    
    public void MostrarGrupo(){
        System.out.print(this.nombre + ": ");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.print(equipos.get(i).Nombre + " ");
        }
        System.out.println("");
    }
    
    public void Simular(){
        this.tabla = new String[totalEquipos][totalEquipos];
        
        Random randomGenerator = new Random();
        
        for (int i = 0; i < totalEquipos; i++) {
            for (int j = i; j < totalEquipos; j++) {
                String resultado;
                if(i == j){
                    tabla[i][j] = "X";
                }else{
                    int golesI = randomGenerator.nextInt(5);
                    int golesJ = randomGenerator.nextInt(5);
                    equipos.get(i).AdicionarGolesFavor(golesI, golesJ);
                    equipos.get(j).AdicionarGolesFavor(golesJ, golesI);
                    
                    if(golesI == golesJ){
                        tabla[i][j] = "E";
                        tabla[j][i] = "E";
                        equipos.get(i).AdicionarPartido("E");
                        equipos.get(j).AdicionarPartido("E");
                    }else if(golesI > golesJ){
                        tabla[i][j] = "G";
                        tabla[j][i] = "P";
                        equipos.get(i).AdicionarPartido("G");
                        equipos.get(j).AdicionarPartido("P");
                    }else if(golesI < golesJ){
                        tabla[i][j] = "P";
                        tabla[j][i] = "G";
                        equipos.get(i).AdicionarPartido("P");
                        equipos.get(j).AdicionarPartido("G");
                    }
                }
            }
        }
    }
    
    public void MostrarTabla(){
        System.out.println("");
        System.out.println(this.nombre + ":");
        
        System.out.print("      ");
        for (int i = 0; i < totalEquipos; i++) {
            System.out.print(equipos.get(i).Nombre + "|");
        }
        System.out.println("");
        
        for (int i = 0; i < totalEquipos; i++) {
            System.out.print(equipos.get(i).Nombre + " || ");
            for (int j = 0; j < totalEquipos; j++) {
                System.out.print(tabla[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
    public void MostrarResultados(){
        System.out.println("");
        System.out.println(this.nombre + ":");
        
        System.out.println("      PU|PJ|PG|PP|PE|GF|GC|DG");
        
        for (int i = 0; i < totalEquipos; i++) {
            System.out.print(equipos.get(i).Nombre + " || ");
            System.out.print(equipos.get(i).puntosTotales + "| " + equipos.get(i).partidosJugados + "| " + equipos.get(i).partidosGanados + "| " + equipos.get(i).partidosPerdidos + "| " + equipos.get(i).partidosEmpatados
                            + "| " + equipos.get(i).golesFavor + "| " + equipos.get(i).golesContra + "| " + equipos.get(i).golesDiferencia);
            System.out.println("");
        }
    }
  
}
