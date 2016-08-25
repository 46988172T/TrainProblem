/**
 * Created by Leonardo Martínez Ubal on 25/08/2016.
 */

public class Arista {
    public Nodo origen;
    public Nodo destino;
    public int distancia;
    public Arista siguiente;
    public Arista(Nodo origen, Nodo destino, int distancia) {
        this.origen 	= origen;
        this.destino	= destino;
        this.distancia 	= distancia;
        this.siguiente 		= null;
    }

    public Arista siguiente(Arista arista) {
        this.siguiente = arista;
        return this;
    }
}
