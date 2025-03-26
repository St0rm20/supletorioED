package punto_2;
import java.util.*;
public class GestorTareas <T> implements Iterable<T> {
    List<T> tareas = new LinkedList<>();

    public void addTarea(T t){
        tareas.add(t);
    }

    public void removeTarea(T t){
        tareas.remove(t);
    }

    public boolean containsTarea(T tarea) {
        return tareas.contains(tarea);
    }

    public void recorrerIterador(){
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new IteradorInverso(tareas);
    }

    public static void main(String[] args) {
        GestorTareas<String> gestor = new GestorTareas<>();
        gestor.addTarea("Tarea 1");
        gestor.addTarea("Tarea 2");
        gestor.addTarea("Tarea 3");

        gestor.recorrerIterador();
    }
}
