/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

import java.util.Random;

/**
 *
 * @author Sulay2016
 */
public class Main {
    
    public static void main(String[] args) {
        MundialFutbol mundial = new MundialFutbol(8, 4);
        mundial.SimularGrupos();
        mundial.InicioSegundaFase();
        
        /*
        Nodo<Integer> arbol = new Nodo<Integer>(1);
        for (int i = 2; i < 33; i++) {
            arbol.add_nodo(i, arbol);
        }
        
        arbol.getInorder(arbol);
        System.out.println("");
        arbol.getPostorder(arbol);
        System.out.println("");
        arbol.getPreorder();
        System.out.println("");
        */
        
        Arbol a = new Arbol(1);
        for (int i = 2; i < 33; i++) {
            a.addNodo(new Nodo2(i));
        }
        
        a.getRaiz().getValor();
        
        /*
        arbol.getInorder(arbol);
        System.out.println("");
        arbol.getPostorder(arbol);
        System.out.println("");
        arbol.getPreorder();
        System.out.println("");
        */
        
        
        
    }
    
}
