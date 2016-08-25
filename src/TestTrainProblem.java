/**
 * Created by Leonardo Martínez Ubal on 25/08/2016.
 */

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.BeforeClass;

public class TestTrainProblem {
    static Grafo grafo;
    static Nodo a, b, c, d, e;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
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
    }

    @org.junit.Test
    public void testDistanciaAbc() throws Exception {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(b);
        ruta.add(c);
        assertEquals(9, grafo.distanciaEntre(ruta));
    }

    @org.junit.Test
    public void testDistanciaAd() throws Exception {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(d);
        assertEquals(5, grafo.distanciaEntre(ruta));
    }

    @org.junit.Test
    public void testDistanciaAdc() throws Exception  {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(d);
        ruta.add(c);
        assertEquals(13, grafo.distanciaEntre(ruta));
    }

    @org.junit.Test
    public void testDistanciaAebcd() throws Exception  {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(e);
        ruta.add(b);
        ruta.add(c);
        ruta.add(d);
        assertEquals(22, grafo.distanciaEntre(ruta));
    }

    @org.junit.Test
    public void testDistanciaAed() throws Exception  {
        ArrayList<Nodo> ruta = new ArrayList<Nodo>();
        ruta.add(a);
        ruta.add(e);
        ruta.add(d);
        assertEquals(-1, grafo.distanciaEntre(ruta));
    }


    @org.junit.Test
    public void testEquals() {
        Nodo a1 = new Nodo("A");
        Nodo a2 = new Nodo("A");
        Nodo b = new Nodo("B");

        assertEquals(true, a1.equals(a2));
        assertEquals(false, a1.equals(b));
        assertEquals(true, (new Nodo("C").equals(new Nodo("C"))));
    }

}