import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Chaining {

    private LinkedList<String>[] tabla;
    private int m;
    static int funcHash(String key, int m) {
        return Math.abs(key.hashCode()) % m;
    }

    public static void main(String[] args) throws Exception {

        String[] names = { "Ana", "Luis", "Carlos", "María", "Juan", "Pedro", "Lucía", "Sofía", "Miguel", "Laura"};

        int m = names.length;

        List<List<String>> table = new ArrayList<>(m);

        // Paso 1: Rellenar los buckets con las listas ligadas
        for (int i = 0; i < m; i++) {
            table.add(new LinkedList<>());
        }

        // Paso 2: Agregar la información a los buckets
        for (String name: names){
            int index = funcHash(name, m);
            table.get(index).add(name);
        }

        // Paso 3: Imprimir la información
        for (int i = 0; i < m; i++) {
            System.out.println(i + "------>" + table.get(i));
        }

    }
}