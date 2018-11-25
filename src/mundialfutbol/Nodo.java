package mundialfutbol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sulay Cupitra
 * * Preorder: Raiz,Izquierda,Derecha
 * postOrden:Izquierda, Derecha,Raiz
 * inorder:Izquierda, Raiz,Derecha
 */
import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.scene.Node;

/**
 *
 * @author Sulay Cupitra
 * * Preorder: Raiz,Izquierda,Derecha
 * postOrden:Izquierda, Derecha,Raiz
 * inorder:Izquierda, Raiz,Derecha
 */
public class Nodo<T>{
     Nodo<T> derecho;
     Nodo<T> izquierdo;
     Nodo<T> padre;
     T info;
    
    public Nodo(T  y){
        this.info=y; 
    }
    
     public void getPreorder(){
        //Preorder: Raiz,Izquierda,Derecha
         System.out.print(info+", ");
         if (izquierdo!=null) {
             izquierdo.getPreorder();
             //System.out.println(izquierdo.info);
         }if (derecho!=null) {
             derecho.getPreorder();
         }
    }
    public void getPostorder(Nodo<T> s){
        // postOrden:Izquierda, Derecha,Raiz
       // System.out.print(info.toString()+", ");
        if (s!=null) {
            getPostorder(s.izquierdo);
            getPostorder(s.derecho);
            System.out.print(s.info+", ");
        }
    }
    public void getInorder(Nodo<T> Risa){
      //inorder:Izquierda, Raiz,Derecha
        if (Risa!=null) {
            getInorder(Risa.izquierdo);
            System.out.print(Risa.info.toString()+", ");
            getInorder(Risa.derecho);
        }
    }
    
    /*public void add_nodo(T buscar, Nodo<T> child){
          Nodo<T> aux;
          aux=child;
          if (buscar.equals(child.info)) {
                           if (aux.izquierdo==null) {
                               aux.izquierdo=new Nodo<T>(buscar);
                               aux.izquierdo.padre=this;
                           }else{
                               izquierdo.add_nodo(buscar, child.izquierdo);
                           }
          }else{
              if (aux.derecho==null) {
                  aux.derecho= new Nodo<T>(buscar);
                  aux.derecho.padre=this;
              }else{
                  aux.derecho.add_nodo(buscar, aux.derecho);
              }
          }
     }*/
    
    /*public void add_nodo(T buscar, Nodo<T> child){
          Nodo<T> aux;
          aux=child;
          if (child.info.equals(buscar)) {
                if (aux.izquierdo==null) {
                    aux.izquierdo=new Nodo<T>(buscar);
                    aux.izquierdo.padre=this;
                }else{
                    izquierdo.add_nodo(buscar, child.izquierdo);
                }
          }else{
                if (aux.derecho==null) {
                    aux.derecho= new Nodo<T>(buscar);
                    aux.derecho.padre=this;
                }else{
                    aux.derecho.add_nodo(buscar, aux.derecho);
                }
          }
     }*/
    
    public void add_nodo(T buscar, Nodo<T> child){
		if (child.info == null){
                    child.info=buscar;
		}
		else{
                    if (buscar.equals(child.info)){
                            if(child.izquierdo == null){
                                    child.izquierdo = new Nodo<T>(buscar);
                            }else{
                                add_nodo(buscar,child.izquierdo);
                            }
                    }else{
                        if (child.derecho==null){
                            child.derecho=new Nodo<T>(buscar);
                        }else{
                            add_nodo(buscar,child.derecho);
                        }
                    }
                }
	}
    
    
    
    
       
    
}
