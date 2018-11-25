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
public class Equipo {
    String Nombre;
    int puntosTotales;
    int partidosJugados;
    int partidosGanados;
    int partidosPerdidos;
    int partidosEmpatados;
    int golesFavor;
    int golesContra;
    int golesDiferencia;

    public Equipo(String Nombre) {
        this.Nombre = Nombre;
        this.puntosTotales = 0;
        this.partidosJugados = 0;
        this.partidosGanados = 0;
        this.partidosPerdidos = 0;
        this.partidosEmpatados = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
        this.golesDiferencia = 0;
    }
    
    public void AdicionarGolesFavor(int golesFavor, int golesContra){
        this.golesFavor += golesFavor;
        this.golesContra += golesContra;
        this.golesDiferencia = this.golesFavor - this.golesContra;
    }
    
    public void AdicionarPartido(String resultado){
        this.partidosJugados++;
        switch(resultado){
            case "E":
                this.partidosEmpatados++;
                this.puntosTotales += 1;
                break;
            case "G":
                this.partidosGanados++;
                this.puntosTotales += 3;
                break;
            case "P":
                this.partidosPerdidos++;
                break;
        }
    }
    
    
}
