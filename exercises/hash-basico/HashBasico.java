public class HashBasico {
    static int funcHash(String key, int m) {
        return key.hashCode() % m;
    }
    public static void main(String[] args) throws Exception {
        int m = 4;

        String[] nombres = { "Ana", "Pedro", "Jose", "Luis"};

        for(String nombre : nombres) {
            int indice = funcHash(nombre, m);
            System.out.println(nombre + " -> Indice: " + indice);
        }
    }
}