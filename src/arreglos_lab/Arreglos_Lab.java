/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_lab;

/**
 *
 * @author Gabriel
 */
public class Arreglos_Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arreglo[]={4,6,5,9};
        
        //Matriz irregular
        int arreglo2[][]= {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        //int datos[][] = new int [3][0];
        //datos[0] = new int[3];
        //datos[1] = new int[4];
        //datos[2] = new int[2];
        
        Arreglos.sumarLista(arreglo);
        Arreglos.buscarMayor(arreglo2);
        Arreglos.cuentaVocales("Hola");
        Arreglos.cuentaCaracter("Hipopotamo",'o');
        
        
    }
    
}
