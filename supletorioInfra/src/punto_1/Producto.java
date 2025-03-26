package punto_1;

public record Producto(String nombre, int stock, double precio)
        implements Comparable<Producto>{

    @Override
    public int compareTo(Producto o) {
        return this.nombre.compareTo(o.nombre);
    }
}
