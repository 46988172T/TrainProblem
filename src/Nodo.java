/**
 * Created by Leonardo Martínez Ubal on 25/08/2016.
 */

public class Nodo {
    public String nombre;
    public boolean visitado;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.visitado = false;
    }

    @Override
    public boolean equals(Object b) {
        if (b == null || b.getClass() != getClass()) {
            return false;
        }
        Nodo nodo = (Nodo)b;
        return this.nombre.equals(nodo.nombre);
    }

    @Override
    public int hashCode() {
        if(this.nombre == null) return 0;
        return this.nombre.hashCode();
    }
}