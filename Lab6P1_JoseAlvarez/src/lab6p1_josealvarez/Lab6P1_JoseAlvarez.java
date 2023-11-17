/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_josealvarez;
import java.util.Scanner;
import java.util.Random;

public class Lab6P1_JoseAlvarez {
    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();
    
    public static char[]conjuntorandom (int tamaño){
        char [] conjunto = new char [tamaño];
        
        for(int i = 0; i < tamaño; i++){
            conjunto [i] = (char) ('A' + random.nextInt(9));
        }
        
        return conjunto;
        
    } // fin metodo generarConjuntoAleatorio
    
    public static void imprimirconjunto(char[] conjunto){
        for(int i = 0; i < conjunto.length; i++){
            System.out.print("[" + conjunto[i] + "]");
        }
        System.out.println();
    }
    
    public static char[] interseccion(char[] set, char[] set2) {
    int maxSize;
    if (set.length < set2.length) {
        maxSize = set.length;
    } else {
        maxSize = set2.length;
    }

    char[] result = new char[maxSize];
    int contador = 0;

    for (int i = 0; i < set.length; i++) {
        char c = set[i];
        for (int j = 0; j < set2.length; j++) {
            char d = set2[j];
            if (c == d) {
                result[contador++] = c;
                
                if (contador == maxSize) {
                    
                    maxSize *= 2; 
                    char[] temp = new char[maxSize];
                    for (int k = 0; k < contador; k++) {
                        temp[k] = result[k];
                    }
                    result = temp;
                }
                break;
            }
        }
    }
    char[] resultado = new char[contador];
    for (int i = 0; i < contador; i++) {
        resultado[i] = result[i];
    }

    return resultado;
}   
    
    
    
    
    
    
   
    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println("1. Conjuntos");
        System.out.println("2. ¿Cuantos primos tienes? ");
        System.out.println("3. Salir del programa");
        System.out.println("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion > 0 && opcion < 3){
        
        switch(opcion){
            
            case 1: 
                System.out.println(" ");
                System.out.println("Conjuntos");
                
                System.out.print("Size SET1: ");
                int SET1 = leer.nextInt();
                
                System.out.print("Size SET2: ");
                int SET2 = leer.nextInt();
                
                
                
                char[] set1 = conjuntorandom(SET1);
                System.out.print("SET1: ");
                imprimirconjunto(set1);

        
                char[] set2 = conjuntorandom(SET2);
                System.out.print("SET2: ");
                imprimirconjunto(set2);
                
                System.out.println(" ");
                System.out.println("Operaciones");
                System.out.println("1. Interseccion");
                System.out.println("2. Diferencia");
                System.out.println("Ingrese una opcion: ");
                int opcionOPERACIONES = leer.nextInt();
                
                switch(opcionOPERACIONES){
                    case 1:
                    char[] interseccionSet = interseccion(set1, set2);
                    System.out.print("Interseccion: ");
                    imprimirconjunto(interseccionSet);
                    break;
                    
                    case 2:
                        
                    
                    break;
                }
                
                
                break;
                
            
            case 2:
                System.out.println(" ");
                System.out.println("Ingrese el tamaño del arreglo a generar: ");
                int tamañoArreglo = leer.nextInt();
                
                System.out.println("Ingrese el límite inferior: ");
                int limiteInferior = leer.nextInt();
                
                System.out.println("Ingrese el límite superior: ");
                int limiteSuperior = leer.nextInt();
                
                break;
                
       

        }// fin switch opciones

        System.out.println(" ");
        System.out.println("1. Conjuntos");
        System.out.println("2. ¿Cuantos primos tienes? ");
        System.out.println("3. Salir del programa");
        System.out.println("Ingrese una opcion: ");
        opcion = leer.nextInt();
        
        } // fin del while opciones principales
    
    
    }// fin del metodo main
        
   
    
}
