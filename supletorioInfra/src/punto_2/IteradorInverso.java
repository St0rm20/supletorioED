package punto_2;

import java.util.*;

public class IteradorInverso<T> implements Iterator<T>{

    private List<T> lista;
    private int indice;

    public IteradorInverso(List<T> lista) {
        this.lista = lista;
        this.indice = lista.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return indice >= 0;
    }

    @Override
    public T next() {
        return lista.get(indice--);
    }
}
