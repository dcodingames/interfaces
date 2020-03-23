/*
 * d.CodinGames.com
 * Clase que genera una serie numérica simple, implementando la interfaz Series
 */
package projectinterfaces;

/**
 *
 * @author Gaby Nieva - d.CodinGames.com
 */
public class SerieSimple implements Series{

        private int numFinal;
        private boolean tipoIncremento;
        
    
    public void setNumFinal(int nfinal){
       this.numFinal = nfinal;
       
    }
    
    public void setTipoIncremento(boolean incremento){
        this.tipoIncremento = incremento;
        
    }
    
        @Override
    public int siguiente(int numActual){
        if (tipoIncremento)
          return numActual+INCREMENTO1;
        else
            return numActual+INCREMENTO2;
        
    }
    
        @Override
    public int anterior(int numActual){
        return 0;
        
    }
    
        @Override
    public boolean revisarFinSerie(int numActual){
        return numActual == numFinal;
        
    }
    
    
    
}
