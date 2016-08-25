/**
 * Created by Leonardo Martínez Ubal on 25/08/2016.
 */

import java.util.ArrayList;

public class App {
    static Grafo grafo;
    static Nodo a, b, c, d, e;
    public static void main(String[] args) throws Exception {
        grafo = new Grafo();

        a = new Nodo("A");
        b = new Nodo("B");
        c = new Nodo("C");
        d = new Nodo("D");
        e = new Nodo("E");

        //Insertamos los inputs en la HashTable
        grafo.hashTableRutas.put(a, new Arista(a, b, 5).siguiente(new Arista(a, d, 5).siguiente(new Arista(a, e, 7))));
        grafo.hashTableRutas.put(b, new Arista(b, c, 4));
        grafo.hashTableRutas.put(c, new Arista(c, d, 8).siguiente(new Arista(c, e, 2)));
        grafo.hashTableRutas.put(d, new Arista(d, c, 8).siguiente(new Arista(d, e, 6)));
        grafo.hashTableRutas.put(e, new Arista(e, b, 3));

        distanciaAbc();     // OUTPUT 1
        distanciaAd();      // OUTPUT 2
        distanciaAdc();     // OUTPUT 3
        distanciaAebcd();   // OUTPUT 4
        distanciaAed();     // OUTPUT 5
    }

    private static void distanciaAbc() throws Exception {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(b);
        ruta.add(c);
        if(grafo.distanciaEntre(ruta) == -1) {
            System.out.println("OUTPUT 1: NO SUCH ROUTE");
        }else{
            System.out.println("OUTPUT 1: "+grafo.distanciaEntre(ruta));
        }
    }

    private static void distanciaAd() throws Exception {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(d);
        if(grafo.distanciaEntre(ruta) == -1) {
            System.out.println("OUTPUT 2: NO SUCH ROUTE");
        }else{
            System.out.println("OUTPUT 2: "+grafo.distanciaEntre(ruta));
        }
    }

    private static void distanciaAdc() throws Exception {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(d);
        ruta.add(c);
        if(grafo.distanciaEntre(ruta) == -1) {
            System.out.println("OUTPUT 3: NO SUCH ROUTE");
        }else{
            System.out.println("OUTPUT 3: "+grafo.distanciaEntre(ruta));
        }
    }

    private static void distanciaAebcd() throws Exception {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(e);
        ruta.add(b);
        ruta.add(c);
        ruta.add(d);
        if(grafo.distanciaEntre(ruta) == -1) {
            System.out.println("OUTPUT 4: NO SUCH ROUTE");
        }else{
            System.out.println("OUTPUT 4: "+grafo.distanciaEntre(ruta));
        }
    }

    private static void distanciaAed() throws Exception {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(e);
        ruta.add(d);
        if(grafo.distanciaEntre(ruta) == -1) {
            System.out.println("OUTPUT 5: NO SUCH ROUTE");
        }else{
            System.out.println("OUTPUT 5: "+grafo.distanciaEntre(ruta));
        }
    }



}
