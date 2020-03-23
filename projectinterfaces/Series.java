/*
 * d.CodinGames.com
 * Interfaz Series, a ser implementada por la clase que lo requiera
 */
package projectinterfaces;

/**
 *
 * @author Gaby Nieva - d.CodinGames.com
 */
public interface Series {
    
    // declaración de constantes
    public final int INCREMENTO1 = 1;
    public final int INCREMENTO2 = 2;
    
    
    //definición de firmas de métodos
    
    public int siguiente(int numActual);
    
    public int anterior(int numActual);
    
    
    public boolean revisarFinSerie(int numActual);
    
    
}
