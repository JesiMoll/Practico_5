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
public class Arreglos {
    
    //a)Método sumarLista que reciba por parámetro un arreglo unidimensional de 
    //enteros y muestre por pantalla la suma y promedio de los mismos.
    public static void sumarLista(int arreglo[]) {
        
        int suma=0;
        double promedio;
        
        for (int i=0; i<arreglo.length; i++) {
            suma += arreglo[i];
        }
        promedio = suma / arreglo.length;
        
        System.out.println("Suma de los numeros ingresados: " + suma);
        System.out.println("Promedio: " + promedio);
        
        //for (int enteros: arreglo) {
            //suma += enteros;
        //}
    }
    
    //b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e 
    //irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
    public static void buscarMayor(int arreglo2[][]) {
        
        int mayor = arreglo2[0][0];
        
        for (int i=0; i<arreglo2.length; i++) {
            for (int j=0; j<arreglo2[i].length; j++) {
                if (arreglo2[i][j] > mayor) {
                    mayor = arreglo2[i][j];
                }
            }
        }
        System.out.println("El mayor numero del arreglo irregular es: " + mayor);
        
    }
    
    //c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad 
    //de vocales que tiene la cadena.
    public static void cuentaVocales(String cadena) {
        
        int cantidad=0;
        String nueva = cadena.toLowerCase();
        
        for (int i=0; i<nueva.length(); i++) {
            if (nueva.charAt(i) == 'a' || nueva.charAt(i) == 'e' || nueva.charAt(i) == 'i' || nueva.charAt(i) == 'o' || nueva.charAt(i) == 'u') {
                cantidad++;
            }
        }
        System.out.println("Cantidad de vocales de la cadena: " + cantidad);
    }
    
    //d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego 
    //retorne la cantidad de veces que se repite en la cadena el carácter recibido.
    public static void cuentaCaracter(String cadena, char c) {
        
        int cantidad=0;
        String nueva = cadena.toLowerCase();
        
        for (int i=0; i<nueva.length(); i++) {
            if (nueva.charAt(i) == c) {
                cantidad++;
            }
        }
        System.out.println("Cantidad de veces que se repite el caracter '" + c + "' en la cadena: " + cantidad);
        
    }
    
}
