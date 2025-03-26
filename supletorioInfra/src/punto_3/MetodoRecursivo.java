package punto_3;

import java.util.*;

public class MetodoRecursivo {
    public static void generarCombinaciones(int n, List<Integer> combinacion) {
        if (combinacion.size() == n) {
            System.out.println(combinacion);
            return;
        }

        for (int i = 1; i <= 6; i++) {
            combinacion.add(i);
            generarCombinaciones(n, combinacion);
            combinacion.remove(combinacion.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generarCombinaciones(n, new ArrayList<>());
    }

}
