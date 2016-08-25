/**
 * Created by Leonardo Martínez Ubal on 25/08/2016.
 */

import java.util.ArrayList;
import java.util.Hashtable;

public class Grafo {
    public Hashtable<Nodo, Arista> hashTableRutas;

    public Grafo() {
        this.hashTableRutas = new Hashtable<Nodo, Arista>();
    }

    public int distanciaEntre(ArrayList<Nodo> ciudades) throws Exception {
        if(ciudades.size() < 2) {
            return 0;
        }
        int distancia, profundidad, i;
        distancia = profundidad = i = 0;

        while(i < ciudades.size() - 1) {
            if(this.hashTableRutas.containsKey(ciudades.get(i))) {
                Arista ruta = this.hashTableRutas.get(ciudades.get(i));

                while(ruta != null) {
                    if(ruta.destino.equals(ciudades.get(i + 1))) {
                        distancia += ruta.distancia;
                        profundidad++;
                        break;
                    }
                    ruta = ruta.siguiente;
                }
            }
            else
                throw new Exception("NO SUCH ROUTE");
            i++;
        }

        if(profundidad != ciudades.size() - 1) {
            return -1;
        }

        return distancia;
    }
}