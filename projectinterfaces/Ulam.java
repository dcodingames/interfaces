/*
 * d.CodinGames.com
 * Clase que genera la serie de Ulam implementando la interfaz Series
 */
package projectinterfaces;

/**
 *
 * @author Gaby Nieva - d.CodinGames.com
 */



public class Ulam implements Series{
     
    
    @Override
    public int siguiente(int numActual){
        if (numActual % 2 == 0 )
            return numActual/2;
        else 
            return numActual*3+1;
        
    }
    
    @Override
    public int anterior(int numActual){
        return 0;
        
    }
    
    @Override
    public boolean revisarFinSerie(int numActual){
        return numActual == 1; 
    }
        
}
