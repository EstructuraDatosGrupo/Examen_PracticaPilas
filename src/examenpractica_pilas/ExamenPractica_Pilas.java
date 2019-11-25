/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpractica_pilas;

import java.util.Stack;

public class ExamenPractica_Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = {20,10,25,30,40};
        int k = 2;
        System.out.println(eliminarPrimerosK (array, k)); 
        
    }
    public  static Stack<Integer> eliminarPrimerosK (int []array,  int k){
        Stack <Integer> pila = new Stack ();
        //añadir el primer elemento para poder empezar a comparar
        pila.push(array[0]);
        int numeroElementos = 0; 
        //recorrer el arreglo 
        for ( int i =0; i<array.length ; i++){
            //verificar si el elemento es menor al tope de la pila 
            //y además está en los primeros k elementos 
            //entonces no lo añadiremos a la pila
            if((array[i]>pila.peek())&&(numeroElementos<=k)) {
                    //si es mayor que el tope y es uno de los primeros k elememtos
                    //entonces lo eliminamos de la pila
                    pila.pop();
                    pila.push(array[i]);
            }
            if (numeroElementos>k) {
                    //no importa si el elemento de mi arreglo 
                    //es mayor o menor igual los voy añadir
                    //porque ya el numeroElementos es mayor que k
                    //lo que significa que ya no tengo que eliminar a ninguno más 
                    pila.push(array[i]);
            }
            numeroElementos++;
        }
        
        return pila;
    }
}