package punto_1;

import java.util.*;
public class Almacen <T extends Producto> implements Iterable<T>{
    private TreeSet<T> productos;

    public Almacen() {
        this.productos = new TreeSet<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        Iterator<T> it = productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void listaOrdenadoPrecio(){
        TreeSet<T> productosOrdenados = new TreeSet<>(Comparator.comparing(Producto::precio));
        productosOrdenados.addAll(productos);
        Iterator<T> it = productosOrdenados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return productos.iterator();
    }

    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();
        almacen.agregarProducto(new Producto("Producto5", 10, 100));
        almacen.agregarProducto(new Producto("Producto1", 20, 80));
        almacen.agregarProducto(new Producto("Producto2", 30, 60));
        almacen.agregarProducto(new Producto("Producto4", 40, 40));
        almacen.agregarProducto(new Producto("Producto3", 50, 20));
        almacen.agregarProducto(new Producto("Producto6", 60, 10));
        almacen.mostrarProductos();
        System.out.println("Lista ordenada por precio");
        almacen.listaOrdenadoPrecio();
    }

}
