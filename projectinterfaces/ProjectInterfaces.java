/*
 * d.CodinGames.com
 * Clase que genera la serie de Ulam implementando la interfaz Series
 */
package projectinterfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gaby Nieva - d.CodinGames.com
 */
public class ProjectInterfaces {

 
    public static void main(String[] args) throws IOException {
        int numero; //numero inicial de las series
 
        SerieSimple serie = new SerieSimple();
        
        System.out.println("Series numéricas - dCodinGames.com");
        
        serie.setTipoIncremento(true); //incremento de 1 en 1
        serie.setNumFinal(10); //La serie termina en 10
        numero = 0; //valor inicial de la serie
        System.out.println("Serie numérica con incremento de 1 en 1: ");
        System.out.print(numero);
        do{
            numero = serie.siguiente(numero);
            System.out.print(" , " + numero);
        }while (!serie.revisarFinSerie(numero));
        System.out.println();
        
        System.out.println("Serie numérica con incremento de 2 en 2: ");
        numero = 0; //valor inicial de la serie
        serie.setTipoIncremento(false); //incremento de 2 en 2
        System.out.print(numero);
        do{
            numero = serie.siguiente(numero);
            System.out.print(" , " + numero);
        }while (!serie.revisarFinSerie(numero));
        System.out.println();
         
           
        Ulam serieUlam = new Ulam();
        numero = 15;
    
        System.out.println("Serie de Ulam: ");
        System.out.print(numero);
        do{
            numero = serieUlam.siguiente(numero);
            System.out.print(" , " + numero);
        }while (!serieUlam.revisarFinSerie(numero));
        System.out.println();
        
    }
    
}
